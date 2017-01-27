
package net.sourceforge.pmd.lang.apex.dfa;

import java.util.List;

import net.sourceforge.pmd.lang.DataFlowHandler;
import net.sourceforge.pmd.lang.ast.Node;
import net.sourceforge.pmd.lang.dfa.DataFlowNode;

public class ApexCFGHandler implements DataFlowHandler {

    @Override
    public DataFlowNode createDataFlowNode(List<DataFlowNode> dataFlow, Node node) {
        return new ApexCFGNode(dataFlow, node);
    }

    @Override
    public Class<? extends Node> getLabelStatementNodeClass() {
        return null;
    }

}
