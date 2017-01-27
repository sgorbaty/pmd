
package net.sourceforge.pmd.lang.apex.dfa;

import java.util.List;

import net.sourceforge.pmd.lang.ast.Node;
import net.sourceforge.pmd.lang.dfa.AbstractDataFlowNode;
import net.sourceforge.pmd.lang.dfa.DataFlowNode;

public class ApexCFGNode extends AbstractDataFlowNode {

    public ApexCFGNode(List<DataFlowNode> dataFlow, Node node) {
        super(dataFlow, node);
    }

}
