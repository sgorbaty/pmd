/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.renderers;

import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;

import net.sourceforge.pmd.PMD;
import net.sourceforge.pmd.RuleViolation;

/**
 * Renderer to simple text format w/ column.
 */
public class TextColumnRenderer extends AbstractIncrementingRenderer {

    public static final String NAME = "columntext";

    public TextColumnRenderer() {
        super(NAME, "Text format with columns.");
    }

    public String defaultFileExtension() {
        return "txt";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void start() throws IOException {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void renderFileViolations(Iterator<RuleViolation> violations) throws IOException {
        Writer writer = getWriter();
        StringBuilder buf = new StringBuilder();

        while (violations.hasNext()) {
            buf.setLength(0);
            RuleViolation rv = violations.next();
            buf.append(rv.getFilename());
            buf.append(':').append(Integer.toString(rv.getBeginLine()));
            buf.append(':').append(Integer.toString(rv.getBeginColumn()));
            buf.append(":\t").append(rv.getDescription()).append(PMD.EOL);
            writer.write(buf.toString());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void end() throws IOException {
    }
}
