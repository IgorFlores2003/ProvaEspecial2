package others;
import Database.DataBase;
import others.*;
import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		Scanner x=new Scanner(System.in);
		int aux=0;
		int choose;
		do {
			Menu();
			choose=Leitor(x);
			
			if(choose==1) {
				System.out.println("Digite o Caminho:");
				String rota=x.nextLine();
				
				System.out.println("RETORNO:"+others.ProcessData.processFile(rota)+"\n");
				}
			else if(choose==2) {
				System.out.println("Arquivos Processados:\n");
			for(int i=0; i<DataBase.processedFiles.size(); i++) {
				System.out.println(DataBase.processedFiles.get(i)+"\n");
			}
			}
		}while( aux==0);
		
	}
	

	public static void Menu() {
		System.out.println("1-Validar/Adicionar Caminho");
		System.out.println("2-Arquivos processados");
		System.out.println("9-Sair");
	}
	public static int Leitor(Scanner x) {
		int aux=x.nextInt();
		x.nextLine();
		return aux;
	}
}
