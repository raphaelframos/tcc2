import model.Inputs;
import utils.FileUtils;
import utils.TextUtils;

public class Main {

	public static void main(String[] args) {
		Inputs inputs = Inputs.newInstance().addAluno1("Vagner de Oliveira").addData("09/12/2019").addOrientador("Raphael Ramos").addTitulo("JUKEBAR: UM APLICATIVO PARA INFLUENCIAR A ESCOLHA DE\r\n" + 
				"MÚSICAS EM EVENTOS AO VIVO");
		StringBuilder text = new StringBuilder();
		text.append("\\documentclass[10pt, a4paper]{book}\r\n" + 
				"\\usepackage[utf8]{inputenc}\r\n" + 
				"\\usepackage{amsmath,amssymb}\r\n" + 
				"\\usepackage{multicol}\r\n" + 
				"\\usepackage{multirow}\r\n" + 
				"\\usepackage{graphicx}\r\n" + 
				"\\usepackage{adjustbox}\r\n" + 
				"\\usepackage{tabularx}\r\n" + 
				"\\usepackage[brazil]{babel}\r\n" + 
				"\\usepackage{caption}\r\n" + 
				"\\usepackage{enumerate}\r\n" + 
				"\\usepackage{float}\r\n" + 
				"\\usepackage{helvet}\r\n" + 
				"\\usepackage{booktabs}\r\n" + 
				"\\usepackage[table,xcdraw]{xcolor}\r\n" + 
				"\\usepackage[margin=1.5cm,headheight=26pt,includeheadfoot]{geometry}\r\n" + 
				"\r\n" + 
				"\\usepackage{fancyhdr}\r\n" + 
				"\\pagestyle{fancy}\r\n" + 
				"\\renewcommand{\\headrulewidth}{0pt}\r\n" + 
				"\\newcommand\\ChangeRT[1]{\\noalign{\\hrule height #1}}\r\n" + 
				"\r\n" + 
				"\\pagenumbering{gobble}");
		text.append("\\newcommand{\\titulo}{\\MakeUppercase{"+inputs.getTituloDoTrabalho()+"}}");
		text.append("\\newcommand{\\data}{"+inputs.getData()+"}");
		text.append("\\newcommand{\\alunoum}{"+inputs.getNomeAluno1()+"}");
		text.append("\\newcommand{\\alunodois}{"+inputs.getNomeAluno2()+"}");
		text.append("\\newcommand{\\orientador}{"+inputs.getNomeOrientador()+"}");
		text.append(TextUtils.createOneLine());
		System.out.println(TextUtils.createOneLine());
		FileUtils.create(inputs.getNomeAluno1(), text.toString());
	}

}
