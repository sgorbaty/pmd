
package net.sourceforge.pmd.lang.apex.dfa;

import net.sourceforge.pmd.lang.DataFlowHandler;
import net.sourceforge.pmd.lang.apex.ast.ASTMethod;
import net.sourceforge.pmd.lang.apex.ast.ApexNode;
import net.sourceforge.pmd.lang.apex.ast.ApexParserVisitorAdapter;

public class CFGFacade extends ApexParserVisitorAdapter {

    public void initializeWith(DataFlowHandler dataFlowHandler, ApexNode<?> node) {
        
        node.jjtAccept(this, new Structure(dataFlowHandler));

    }

    public Object visit(ASTMethod node, Object data) {

        return data;
    }

}
