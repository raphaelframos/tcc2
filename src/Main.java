import java.util.ArrayList;
import java.util.List;

import model.Inputs;
import utils.FileUtils;
import utils.TextUtils;

public class Main {

	public static void main(String[] args) {
		
		
		Inputs inputs = Inputs.newInstance()
				.addAluno1("Bernardo Citelis Mangueira")
				.addAluno2("Ediandro Ferreira")
				.addData("10/12/2019")
				.addDataCompleta("10 de dezembro de 2019")
				.addOrientador("Fábio Machado")
				.addProf1("Ítalo Coutinho dos Santos")
				.addProf2("Thiago Ximenes")
				.addTitulo("Estudo e análise de ferramentas anti-trapaça do jogo counter-strike: global offensive");
		
		Inputs inputs2 = Inputs.newInstance()
				.addAluno1("Giovanni Bruno de Lima Avelino")
				.addData("10/12/2019")
				.addDataCompleta("10 de dezembro de 2019")
				.addOrientador("Raphael Ferreira Ramos")
				.addProf1("Flávio Terra")
				.addProf2("Joelmir Vinhosa Canazaro")
				.addTitulo("Aplicativo para acompanhamento educacional do aluno em sala de aula e acompanhamento do professor no processo de aprendizagem");
		
		Inputs inputs3 = Inputs.newInstance()
				.addAluno1("Leonardo Garcia Rangel")
				.addData("10/12/2019")
				.addDataCompleta("10 de dezembro de 2019")
				.addOrientador("Raphael Ferreira Ramos")
				.addProf1("Flávio Terra")
				.addProf2("Joelmir Vinhosa Canazaro")
				.addTitulo("API restfull para portais de prefeituras");
		
		Inputs inputs4 = Inputs.newInstance()
				.addAluno1("Gabriel Ribeiro Freitas de Sá")
				.addData("10/12/2019")
				.addDataCompleta("10 de dezembro de 2019")
				.addOrientador("Fábio Machado")
				.addProf1("Matheus Mattos")
				.addProf2("Joelmir Vinhosa Canazaro")
				.addTitulo("API restfull para portais de prefeituras");
		
		Inputs inputs5 = Inputs.newInstance()
				.addAluno1("Pedro Poiani Resende")
				.addData("10/12/2019")
				.addDataCompleta("10 de dezembro de 2019")
				.addOrientador("Raphael Ferreira Ramos")
				.addProf1("Flávio Terra")
				.addProf2("Jamil Bussade")
				.addTitulo("Desenvolvimento de uma aplicação móvel para auxiliar na busca por professores particulares");
		
		Inputs inputs6 = Inputs.newInstance()
				.addAluno1("Anderson Fonseca Barbosa")
				.addData("10/12/2019")
				.addDataCompleta("10 de dezembro de 2019")
				.addOrientador("Raphael Ferreira Ramos")
				.addProf1("Matheus Mattos")
				.addProf2("Jamil Bussade")
				.addTitulo("Sistema de informação para o controle de atividades internas aplicado a uma pequena empresa no ramo de confecções");
		
		List<Inputs> list = new ArrayList<Inputs>();
		list.add(inputs);
		list.add(inputs2);
		list.add(inputs3);
		list.add(inputs4);
		list.add(inputs5);
		list.add(inputs6);
		cleanFolder();
	//	create(list);
	}

	private static void cleanFolder() {
		FileUtils.clean();
	}

	private static void create(List<Inputs> list) {
		for(Inputs inputs : list){
			StringBuilder text = new StringBuilder();
			text.append(TextUtils.createHeader());
			text.append("\\newcommand{\\titulo}{\\MakeUppercase{"+inputs.getTituloDoTrabalho()+"}}");
			text.append("\\newcommand{\\data}{"+inputs.getData()+"}");
			text.append("\\newcommand{\\alunoum}{"+inputs.getNomeAluno1()+"}");
			if(inputs.possuiDoisAlunos()){
				text.append("\\newcommand{\\alunodois}{"+inputs.getNomeAluno2()+"}");
			}
			text.append("\\newcommand{\\orientador}{"+inputs.getNomeOrientador()+"}");
			text.append("\\newcommand{\\datacompleta}{"+inputs.getDataCompleta()+"}");
			text.append("\\newcommand{\\profum}{"+inputs.getProf1()+"}");
			text.append("\\newcommand{\\profdois}{"+inputs.getProf2()+"}");
			text.append(TextUtils.createOneLine());
			FileUtils.create(inputs.getNomeAluno1(), text.toString());
			
		}
	}

}
