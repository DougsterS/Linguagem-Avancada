package br.cc.unipe.aula11.pacotes.atividade;

import br.cc.unipe.aula11.pacotes.atividade.unipe.aluno.Matricula;
import br.cc.unipe.aula11.pacotes.atividade.unipe.aluno.Nome;
import br.cc.unipe.aula11.pacotes.atividade.unipe.curso.NomeCurso;
import br.cc.unipe.aula11.pacotes.atividade.unipe.curso.UnidadeAcademica;

public class Unipe {
	
	public static void main(String[] args) {
		
		NomeCurso curso = new NomeCurso();
		Nome nome = new Nome();
		Matricula matricula = new Matricula();
		UnidadeAcademica faculdade = new UnidadeAcademica();
		
		nome.setNome("Douglas Monteiro");
		curso.setNome("Ciência da Computação");
		matricula.setMatricula("123.456.789");
		faculdade.setNome("Unipe");
		
		System.out.println("Aluno: " + nome.getNome());
		System.out.println("Unidade Acadêmica: " + faculdade.getNome());
		System.out.println("Matricula: " + matricula.getMatricula());
		System.out.println("Curso: " + curso.getNome());
	}
	
}
