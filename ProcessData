package others;
import others.ErroCode;
import Database.DataBase;
public class ProcessData {

	
	public static ErroCode processFile(String filePath) {
		
		if(filePath.isEmpty()) {
			return ErroCode.FilednotFound;
		}
		else if(filePath.length()< 5 || filePath.length()> 5 ) {
		return ErroCode.Validation;
	}
	else {
		DataBase.addProcessedFile(filePath);
		return null;
	}
		
		
	}}
