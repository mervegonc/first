package hrms.second.core.utilites.results;



public class DataResult <T>extends Result{

	private T data;
	
	public DataResult(T data,boolean success, String message) {
		super(success, message);//super set eder base sınıfınkini burada da zaten super Result un consctructorlarını set ediyor
		this.data = data;
	}
	
	public DataResult(T data, boolean success) {
		super(success);
		this.data = data;
	}	
		public T getData() {
			return this.data;
		}
		
	}