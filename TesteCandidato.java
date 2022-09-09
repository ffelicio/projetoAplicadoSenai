import javax.print.event.PrintEvent;

public class TesteCandidato {
    public static void main(String[] args) {
      
    //Instaciamento dos candidatos

        Candidato candidato1 = new Candidato();
        Candidato candidato2 = new Candidato();
   
    //Definição de parametros do candidato 01

        candidato1.setNomeCandidato("Bolsonaro");
        candidato1.setNomePartido("Partido Liberal");
        candidato1.setSiglaPartido(22);
        candidato1.setIdadeCandidato(65);
        candidato1.setSexoCandidato("Masculino");

    //Definição de parametros do candidato 02

        candidato2.setNomeCandidato("Lula");
        candidato2.setNomePartido("Partido dos Trabalhadores");
        candidato2.setSiglaPartido(13);
        candidato2.setIdadeCandidato(70);
        candidato2.setSexoCandidato("Masculino");

    //Imprime valores

    System.out.println("O nome do candidato é: " + candidato1.getNomeCandidato());
    System.out.println("O candidato é do partido: " + candidato1.getNomePartido());
    System.out.println("O candidato tem: " + candidato1.getIdadeCandidato() + " anos");
    System.out.println("O candidato é do sexo: " + candidato1.getSexoCandidato());
    System.out.println("O número do candidato " + candidato1.getNomeCandidato() + " é o: " + candidato1.getSiglaPartido());
}

}