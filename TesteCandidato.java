import java.util.Scanner;
   
public class TesteCandidato {
    
     public static void main(String[] args) {
    
        // Faz Leitura do Usuário:Nome do Candidato
        System.out.println("Digite o nome do Candidato: ");
        Scanner pergunta = new Scanner(System.in);
        String nomeDoCandidato = pergunta.nextLine();

        // Faz Leitura do Usuário:Partido do Candidato
        System.out.println("Digite o partido do Candidato: ");
        String partidoDoCandidato = pergunta.nextLine();
        
        // Faz Leitura do Usuário:Sigla do Candidato
        System.out.println("Digite a sigla do partido: ");
        int siglaDoPartido = pergunta.nextInt();
                
        // Faz Leitura do Usuário:Idade do Candidato
        System.out.println("Digite a idade do candidato: ");
        int idadeDoCandidato = pergunta.nextInt();

        // Faz Leitura do Usuário:Sexo do Candidato
        System.out.println("Digite o sexo do Candidato: ");
        String sexoDoCandidato = pergunta.next();
        pergunta.close();      

        //Instaciamento dos candidatos

        Candidato candidato1 = new Candidato();
      
        //Definição de parametros do candidato 01

        candidato1.setNomeCandidato(nomeDoCandidato);
        candidato1.setNomePartido(partidoDoCandidato);
        candidato1.setSiglaPartido(siglaDoPartido);
        candidato1.setIdadeCandidato(idadeDoCandidato);
        candidato1.setSexoCandidato(sexoDoCandidato);

        //Imprime valores

        System.out.println("O nome do candidato é " + candidato1.getNomeCandidato());
        System.out.println("O candidato é do " + candidato1.getNomePartido());
        System.out.println("A sigla do partido é  " + candidato1.getSiglaPartido());
        System.out.println("O candidato tem " + candidato1.getIdadeCandidato() + " anos");
        System.out.println("O candidato é do sexo " + candidato1.getSexoCandidato());
        
        }

}
