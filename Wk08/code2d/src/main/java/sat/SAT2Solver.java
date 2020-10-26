package sat;

package sat;

import immutable.ImList;
import sat.env.Environment;
import sat.formula.Clause;
import sat.formula.Formula;
import sat.formula.Literal;
import sat.formula.NegLiteral;

public class SAT2Solver {
    public static Environment solve(Formula formula) {

        Environment env = new Environment();
        ImList<Clause> clauses = formula.getClauses();
        return solve(clauses, env);
    }

    private static Environment solve(ImList<Clause> clauses, Environment env) {

    }
}
