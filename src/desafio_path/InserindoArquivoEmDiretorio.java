package desafio_path;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InserindoArquivoEmDiretorio {
	public static void main(String[] args) throws IOException {
		//O objetivo desse codigo é criar um diretorio e um arquivo txt, ao final colocar o arquivo dentro do diretorio. 
		//utilizando os metodos existentes nas bibliotecas 
		//java.io.File
		//java.nio.file.Path
		//java.nio.file.Paths
		
		
		//Criando diretorio
		File diretorio = new File("Criando Diretorio");
		diretorio.mkdir();
		
		//identificando URI do diretorio atraves do metodo get da biblioteca paths. 
		Path caminho = Paths.get(diretorio.toURI() );
		
		//Exibindo URI do diretorio "Criando Diretorio"
		System.out.println(caminho);
		
		//criando arquivo
		File doc = new File("texto.txt");
		doc.createNewFile();
		
		//Exibindo URI do arquivo "texto.txt".
		Path path = Paths.get(doc.toURI() );
		
		System.out.println ("getFileName:"+ path.getFileName ());
		//Retorna o nome do arquivo ou diretório indicado por este caminho como um Pathobjeto. O nome do arquivo é o elemento mais distante da raiz na hierarquia de diretório.
		
		System.out.println("getParent:"+ path.getParent ());
		//Retorna o caminho pai , ou null se este caminho não tiver um pai.
		
		System.out.println ("getRoot:"+ path.getRoot ());
		//Retorna o componente raiz deste caminho como um Path objeto ou null se este caminho não tiver um componente raiz.
		
	}
}
