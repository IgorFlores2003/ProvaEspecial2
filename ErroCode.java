package others;

public enum ErroCode {

	
	Validation(1),
	FilednotFound(2);

	private Integer code;
	
	ErroCode(Integer code){
		
	}

	public void setCode(Integer code) {
		this.code = code;
	}
	public Integer getCode() {
		return code;
	}
	
	public static ErroCode fromcode(Integer code) {
        for (ErroCode ErroCode : ErroCode.values()) {
            if (ErroCode.getCode().equals(code)) {
                return ErroCode;
            }
        }

        return null;
    }
}

