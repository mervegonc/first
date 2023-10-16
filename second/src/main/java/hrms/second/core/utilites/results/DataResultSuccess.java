package hrms.second.core.utilites.results;


public class DataResultSuccess<T> extends DataResult<T>{//başarılı olursa;

	public DataResultSuccess(T data, String message) {
		super(data,true, message);
	}

	public DataResultSuccess(T data) {
		super(data,true);
	}
	public DataResultSuccess(String message) {
		super(null,true,message);
	}
	public DataResultSuccess() {
		super(null,true);
	}
}

