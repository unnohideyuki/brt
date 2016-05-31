package jp.ne.sakura.uhideyuki.brt.brtsyn;

public class LetExpr extends Expr {
    public String[] names;
    public Expr[] es;
    public LambdaForm lambda;
    public LetExpr(String[] ns, Expr[] xs, LambdaForm lam){ 
	names = ns;
	es = xs; 
	lambda = lam; 
    }
}
