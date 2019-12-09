import model.Inputs;
import utils.FileUtils;

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
		text.append("\\begin{document}\r\n" + 
				"\\lhead{\\includegraphics[width=1.2cm]{img/cabecalho}\\hfill \\footnotesize Normas para apresentação de Projeto Final em Sistemas de Informação\\hfill}\r\n" + 
				"\\rfoot{Sistemas de Informação - UniRedentor}\r\n" + 
				"\\begin{center}\r\n" + 
				"\\textbf{ANEXO 7}\r\n" + 
				"\\end{center}\r\n" + 
				"\\begin{table}[H]\r\n" + 
				"\\resizebox{\\textwidth}{!}{\r\n" + 
				"\\begin{tabular}{|\r\n" + 
				">{\\columncolor[HTML]{BAC9F4}}c |}\r\n" + 
				"\\hline\\ChangeRT{1pt}\r\n" + 
				"\\textbf{\\begin{tabular}[c]{@{}c@{}}FICHA DE AVALIAÇÃO DO CUMPRIMENTO DO CRONOGRAMA – PROFESSOR\\\\ DA DISCIPLINA\\end{tabular}} \\\\\\hline\\ChangeRT{1pt}\\end{tabular}}\\end{table}\r\n" + 
				"\\bgroup\\obeylines\r\n" + 
				"\\textbf{Aluno (a) 1:} \\alunoum\\newline\r\n" + 
				"\\textbf{Aluno (a) 2:} \\alunodois\\newline\r\n" + 
				"\\textbf{Orientador:} \\orientador\\newline\\\\ \r\n" + 
				"\\textbf{TÍTULO DO TRABALHO}\\\\\r\n" + 
				"\\underline{\\titulo}\\newline\\newline\r\n" + 
				"\\egroup\r\n" + 
				"\\textbf{CRITÉRIOS DE AVALIAÇÃO - Valor total 3,0 pontos}\\newline\r\n" + 
				"\\begin{table}[H]\r\n" + 
				"\\resizebox{\\textwidth}{!}{%\r\n" + 
				"\\begin{tabular}{|c|c|c|}\r\n" + 
				"\\hline\\ChangeRT{1pt}\r\n" + 
				"\\rowcolor[HTML]{BAC9F4} \r\n" + 
				"\\textbf{CRITÉRIOS}                                                                        & \\textbf{VALOR} & \\textbf{VALOR ATRIBUÍDO} \\\\ \\hline\r\n" + 
				"\\textbf{Assiduidade e Pontualidade}                                                       & \\textbf{0,5}   & \\textbf{}                \\\\ \\hline\r\n" + 
				"\\textbf{Desenvolvimento da Metodologia Proposta}                                          & \\textbf{1,0}   & \\textbf{}                \\\\ \\hline\r\n" + 
				"\\multicolumn{1}{|r|}{\\textbf{Avaliação da apresentação segundo a metodologia científica}} & \\textbf{1,5}   & \\textbf{}                \\\\ \\hline\r\n" + 
				"\\rowcolor[HTML]{BAC9F4} \r\n" + 
				"\\multicolumn{2}{|r|}{\\cellcolor[HTML]{BAC9F4}\\textbf{Total}}                                               & \\textbf{}                \\\\ \\hline\\ChangeRT{1pt}\r\n" + 
				"\\end{tabular}%\r\n" + 
				"}\r\n" + 
				"\\end{table}\r\n" + 
				"\\textbf{COMENTÁRIOS E SUGESTÕES} \\newline\r\n" + 
				"\\par\\noindent\\rule{\\textwidth}{0.1pt}\\newline\r\n" + 
				"\\par\\noindent\\rule{\\textwidth}{0.1pt}\\newline\r\n" + 
				"\\par\\noindent\\rule{\\textwidth}{0.1pt}\\newline\r\n" + 
				"\\par\\noindent\\rule{\\textwidth}{0.1pt}\\newline\r\n" + 
				"\\par\\noindent\\rule{\\textwidth}{0.1pt}\\newline\r\n" + 
				"\\par\\noindent\\rule{\\textwidth}{0.1pt}\\newline\r\n" + 
				"\\hfill Itaperuna, \\data\\newline\\newline\r\n" + 
				"Professor da disciplina: \\dotfill\r\n" + 
				"\\newpage \r\n" + 
				"\\begin{center}\r\n" + 
				"\\textbf{ANEXO 8}\r\n" + 
				"\\end{center}\r\n" + 
				"\\begin{table}[H]\r\n" + 
				"\\resizebox{\\textwidth}{!}{\r\n" + 
				"\\begin{tabular}{|\r\n" + 
				">{\\columncolor[HTML]{BAC9F4}}c |}\r\n" + 
				"\\hline\\ChangeRT{1pt}\r\n" + 
				"\\textbf{\\begin{tabular}[c]{@{}c@{}}FICHA DE AVALIAÇÃO DO CUMPRIMENTO DO CRONOGRAMA – ORIENTADOR\\end{tabular}} \\\\ \\hline\\ChangeRT{1pt}\r\n" + 
				"\\end{tabular}}\r\n" + 
				"\\end{table}\r\n" + 
				"\\bgroup\\obeylines\r\n" + 
				"\\textbf{Aluno (a) 1:} \\alunoum\\newline\r\n" + 
				"\\textbf{Aluno (a) 2:} \\alunodois\\newline\r\n" + 
				"\\textbf{Orientador:} \\orientador\\newline\\\\ \r\n" + 
				"\\textbf{TÍTULO DO TRABALHO}\\\\\r\n" + 
				"\\underline{\\titulo}\\newline\\newline\r\n" + 
				"\\egroup\r\n" + 
				"\\textbf{CRITÉRIOS DE AVALIAÇÃO - Valor total 3,0 pontos}\\newline\r\n" + 
				"\\begin{table}[H]\r\n" + 
				"\\resizebox{\\textwidth}{!}{%\r\n" + 
				"\\begin{tabular}{|c|c|c|}\r\n" + 
				"\\hline\\ChangeRT{1pt}\r\n" + 
				"\\rowcolor[HTML]{BAC9F4} \r\n" + 
				"\\textbf{CRITÉRIOS}                                                                        & \\textbf{VALOR} & \\textbf{VALOR ATRIBUÍDO} \\\\ \\hline\r\n" + 
				"\\textbf{Assiduidade e Pontualidade}                                                       & \\textbf{0,5}   & \\textbf{}                \\\\ \\hline\r\n" + 
				"\\textbf{Desenvolvimento da Metodologia Proposta}                                          & \\textbf{1,0}   & \\textbf{}                \\\\ \\hline\r\n" + 
				"\\multicolumn{1}{|r|}{\\textbf{Avaliação da apresentação segundo a metodologia científica}} & \\textbf{1,5}   & \\textbf{}                \\\\\\hline\r\n" + 
				"\\rowcolor[HTML]{BAC9F4} \r\n" + 
				"\\multicolumn{2}{|r|}{\\cellcolor[HTML]{BAC9F4}\\textbf{Total}}                                               & \\textbf{}                \\\\ \\hline\\ChangeRT{1pt}\r\n" + 
				"\\end{tabular}%\r\n" + 
				"}\r\n" + 
				"\\end{table}\r\n" + 
				"\\textbf{COMENTÁRIOS E SUGESTÕES} \\newline\r\n" + 
				"\\par\\noindent\\rule{\\textwidth}{0.1pt}\\newline\r\n" + 
				"\\par\\noindent\\rule{\\textwidth}{0.1pt}\\newline\r\n" + 
				"\\par\\noindent\\rule{\\textwidth}{0.1pt}\\newline\r\n" + 
				"\\par\\noindent\\rule{\\textwidth}{0.1pt}\\newline\r\n" + 
				"\\par\\noindent\\rule{\\textwidth}{0.1pt}\\newline\r\n" + 
				"\\par\\noindent\\rule{\\textwidth}{0.1pt}\\newline\r\n" + 
				"\\hfill Itaperuna, \\data\\newline\\newline\r\n" + 
				"Professor da disciplina: \\dotfill\r\n" + 
				"\\newpage \r\n" + 
				"\\begin{center}\r\n" + 
				"\\textbf{ANEXO 9}\r\n" + 
				"\\end{center}\r\n" + 
				"\\begin{table}[H]\r\n" + 
				"\\resizebox{\\textwidth}{!}{\r\n" + 
				"\\begin{tabular}{|\r\n" + 
				">{\\columncolor[HTML]{BAC9F4}}c |}\r\n" + 
				"\\hline\\ChangeRT{0.5pt}\r\n" + 
				"\\textbf{\\begin{tabular}[c]{@{}c@{}}FICHA DE AVALIAÇÃO - MEMBRO DA BANCA 1\\end{tabular}} \\\\ \\hline\\ChangeRT{0.5pt}\r\n" + 
				"\\end{tabular}}\r\n" + 
				"\\end{table}\r\n" + 
				"\\bgroup\\obeylines\r\n" + 
				"\\textbf{Aluno (a) 1:} \\alunoum\\newline\r\n" + 
				"\\textbf{Aluno (a) 2:} \\alunodois\\newline\r\n" + 
				"\\textbf{Orientador:} \\orientador\\newline\\\\ \r\n" + 
				"\\textbf{TÍTULO DO TRABALHO}\\\\\r\n" + 
				"\\underline{\\titulo}\\newline\\newline\r\n" + 
				"\\egroup\r\n" + 
				"\\begin{table}[H]\r\n" + 
				"\\resizebox{\\textwidth}{!}{%\r\n" + 
				"\\begin{tabular}{|c|c|c|}\r\n" + 
				"\\hline\\ChangeRT{1pt}\r\n" + 
				"\\rowcolor[HTML]{BAC9F4} \r\n" + 
				"\\textbf{Produção Escrita - Artigo Científico}     & \\textbf{Valor}   & \\textbf{Nota Atribuída} \\\\ \\hline\r\n" + 
				"Relevância para publicação                        & 2,0              &                         \\\\ \\hline\r\n" + 
				"Qualidade da redação                              & 1,0              &                         \\\\ \\hline\r\n" + 
				"Formatação                                        & 1,0              &                         \\\\ \\hline\r\n" + 
				"Desenvolvimento e interpretação de dados          & 2,0              &                         \\\\ \\hline\r\n" + 
				"Consolidação da conclusão e recomendações futuras & 1,0              &                         \\\\ \\hline\r\n" + 
				"\\rowcolor[HTML]{BAC9F4} \r\n" + 
				"\\textbf{Apresentação Oral}                        & \\textbf{Valor}   & \\textbf{Nota Atribuída} \\\\ \\hline\r\n" + 
				"Apresentação audiovisual                          & 1,0                &                         \\\\ \\hline\r\n" + 
				"Domínio do conteúdo                               & 1,0                &                         \\\\ \\hline\r\n" + 
				"Adequação ao tempo disponível                     & 1,0                &                         \\\\ \\hline\r\n" + 
				"                                                  & Total (10,0)     &                         \\\\ \\hline\r\n" + 
				"                                                  & Total (peso 7,0) &                         \\\\ \\hline\\ChangeRT{1pt}\r\n" + 
				"\\end{tabular}%\r\n" + 
				"}\r\n" + 
				"\\end{table}\r\n" + 
				"\\bgroup\\obeylines\r\n" + 
				"\\textbf{Professor Orientador:} \\dotfill \\newline\r\n" + 
				"\\textbf{Professor da Disciplina:} \\dotfill \\newline\r\n" + 
				"\\textbf{Avaliador:}  \\dotfill\\newline \\\\\r\n" + 
				"\\hfill Itaperuna, \\data\r\n" + 
				"\\egroup\r\n" + 
				"\\newpage \r\n" + 
				"\\begin{center}\r\n" + 
				"\\textbf{ANEXO 10-a}\\\\\\textbf{Via da Banca Examinadora}\r\n" + 
				"\\end{center}\r\n" + 
				"\\begin{table}[H]\r\n" + 
				"\\resizebox{\\textwidth}{!}{\r\n" + 
				"\\begin{tabular}{|\r\n" + 
				">{\\columncolor[HTML]{BAC9F4}}c |}\r\n" + 
				"\\hline\\ChangeRT{0.3pt}\r\n" + 
				"\\textbf{\\begin{tabular}[c]{@{}c@{}}RECOMENDAÇÕES DA BANCA EXAMINADORA\\end{tabular}} \\\\ \\hline\\ChangeRT{0.3pt}\r\n" + 
				"\\end{tabular}}\r\n" + 
				"\\end{table}\r\n" + 
				"\\bgroup\\obeylines\r\n" + 
				"\\textbf{Aluno (a) 1:} \\alunoum\\newline\r\n" + 
				"\\textbf{Aluno (a) 2:} \\alunodois\\newline\r\n" + 
				"\\textbf{Orientador:} \\orientador\\newline\\\\ \r\n" + 
				"\\textbf{TÍTULO DO TRABALHO}\\\\\r\n" + 
				"\\underline{\\titulo}\\newline\\newline\r\n" + 
				"\\egroup\r\n" + 
				"\\textbf{NOTA FINAL*:} \\hrulefill\\\\\\hspace{1cm}\\small\\*(Somatório das notas dos anexos 7, 8, e 9) dividido por 2.\\\\\r\n" + 
				"\\textbf{SITUAÇÃO}: \\hspace{0.1cm} \\mbox{\\ooalign{\\cr\\hidewidth$\\square$\\hidewidth\\cr}}\r\n" + 
				"\\hspace{0.1cm}\\textbf{APROVADO}\\hspace{0.3cm} \\mbox{\\ooalign{\\cr\\hidewidth$\\square$\\hidewidth\\cr}} \\hspace{0.1cm}\\textbf{REPROVADO}\\\\\r\n" + 
				"\\textbf{AVALIAÇÃO - COMENTÁRIOS E SUGESTÕES}\\\\\r\n" + 
				"\\par\\noindent\\rule{\\textwidth}{0.1pt}\\newline\r\n" + 
				"\\par\\noindent\\rule{\\textwidth}{0.1pt}\\newline\r\n" + 
				"\\par\\noindent\\rule{\\textwidth}{0.1pt}\\newline\r\n" + 
				"\\par\\noindent\\rule{\\textwidth}{0.1pt}\\newline\r\n" + 
				"\\par\\noindent\\rule{\\textwidth}{0.1pt}\\newline\r\n" + 
				"\\par\\noindent\\rule{\\textwidth}{0.1pt}\\newline\r\n" + 
				"\\bgroup\\obeylines\r\n" + 
				"\\textbf{Professor Orientador:} \\dotfill \\newline\r\n" + 
				"\\textbf{Avaliador 2:} \\dotfill \\newline\r\n" + 
				"\\textbf{Avaliador 3:} \\dotfill \\newline\r\n" + 
				"\\textbf{Aluno (a) 1:} \\dotfill\\newline \r\n" + 
				"\\textbf{Aluno (a) 2:} \\dotfill\\newline \\\\\r\n" + 
				"\\hfill Itaperuna, \\data\r\n" + 
				"\\egroup\r\n" + 
				"\\newpage \r\n" + 
				"\\begin{center}\r\n" + 
				"\\textbf{ANEXO 10-b}\\\\\\textbf{Via dos Alunos}\r\n" + 
				"\\end{center}\r\n" + 
				"\\begin{table}[H]\r\n" + 
				"\\resizebox{\\textwidth}{!}{\r\n" + 
				"\\begin{tabular}{|\r\n" + 
				">{\\columncolor[HTML]{BAC9F4}}c |}\r\n" + 
				"\\hline\\ChangeRT{0.3pt}\r\n" + 
				"\\textbf{\\begin{tabular}[c]{@{}c@{}}RECOMENDAÇÕES DA BANCA EXAMINADORA\\end{tabular}} \\\\ \\hline\\ChangeRT{0.3pt}\r\n" + 
				"\\end{tabular}}\r\n" + 
				"\\end{table}\r\n" + 
				"\\bgroup\\obeylines\r\n" + 
				"\\textbf{Aluno (a) 1:} \\alunoum\\newline\r\n" + 
				"\\textbf{Aluno (a) 2:} \\alunodois\\newline\r\n" + 
				"\\textbf{Orientador:} \\orientador\\newline\\\\ \r\n" + 
				"\\textbf{TÍTULO DO TRABALHO}\\\\\r\n" + 
				"\\underline{\\titulo}\\newline\\newline\r\n" + 
				"\\egroup\r\n" + 
				"\\textbf{AVALIAÇÃO - COMENTÁRIOS E SUGESTÕES}\\\\\r\n" + 
				"\\par\\noindent\\rule{\\textwidth}{0.1pt}\\newline\r\n" + 
				"\\par\\noindent\\rule{\\textwidth}{0.1pt}\\newline\r\n" + 
				"\\par\\noindent\\rule{\\textwidth}{0.1pt}\\newline\r\n" + 
				"\\par\\noindent\\rule{\\textwidth}{0.1pt}\\newline\r\n" + 
				"\\par\\noindent\\rule{\\textwidth}{0.1pt}\\newline\r\n" + 
				"\\par\\noindent\\rule{\\textwidth}{0.1pt}\\newline\r\n" + 
				"\\bgroup\\obeylines\r\n" + 
				"\\textbf{Professor Orientador:} \\dotfill \\newline\r\n" + 
				"\\textbf{Avaliador 2:} \\dotfill \\newline\r\n" + 
				"\\textbf{Avaliador 3:} \\dotfill \\newline\r\n" + 
				"\\textbf{Aluno (a) 1:} \\dotfill\\newline \r\n" + 
				"\\textbf{Aluno (a) 2:} \\dotfill\\newline \\\\\r\n" + 
				"\\hfill Itaperuna, \\data\r\n" + 
				"\\egroup\r\n" + 
				"\\end{document}");
		FileUtils.create(inputs.getNomeAluno1(), text.toString());
	}

}
