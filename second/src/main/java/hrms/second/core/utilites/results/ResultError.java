package hrms.second.core.utilites.results;

public class ResultError extends Result{
	
	public ResultError(){
		super(false);
		}
	
	public ResultError(String message) {
		super(false,message);
	}
}


