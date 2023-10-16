package hrms.second.core.utilites.results;



public class ResultSuccess extends Result{

	public ResultSuccess(){
		super(true);
		}
	
	public ResultSuccess(String message) {
		super(true,message);
	}
}