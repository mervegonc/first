package hrms.second.core.utilites.results;



public class DataResultError<T> extends DataResult<T> {
	public DataResultError(T data, String message) {
		super(data,false, message);
	}

	public DataResultError(T data) {
		super(data,false);
	}
	public DataResultError(String message) {
		super(null,false,message);
	}
	public DataResultError() {
		super(null,false);
	}

}
