package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entidades.Comentario;
import entidades.Postagem;

public class ProgramaStringBuilder {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comentario c1 = new Comentario("Tenha uma boa viagem");
		Comentario c2 = new Comentario("Isso é incrível");
		Postagem p1 = new Postagem(sdf.parse("21/06/2018 13:05:44"), "Viagem a Nova Zelândia",
				"Vou visitar esse país maravilhoso", 12);
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		Comentario c3 = new Comentario("Boa noite");
		Comentario c4 = new Comentario("Isso é lamentável");
		Postagem p2 = new Postagem(sdf.parse("30/06/2019 13:05:44"), "Viagem a Paris",
				"Irei agora", 15);
		p2.addComentario(c3);
		p2.addComentario(c4);	
		
		System.out.println("Postagem: "+p1);
		System.out.println("Postagem: "+p2);
		
		sc.close();

	}
}
