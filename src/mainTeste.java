import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class mainTeste {
    public static void main(String[] args) throws Exception {

        // Trabalhando com Strings:
    
        System.out.println("Hello, World!");
        String companyName0 = "Grand Ventures";
        String companyName1 = "Silver Slivers";
        String companyName2 = "Titan Trove";

        ArrayList<String> companyNameList = new ArrayList<>();
        companyNameList.add(companyName2);
        companyNameList.add(companyName0);
        companyNameList.add(companyName1);

        System.out.println();
        System.out.println("Lista desordenada: ");
        System.out.println(companyNameList);

        Collections.sort(companyNameList); // sort com Strings não precisa de um comparator (Usa ordem lexicográfica)
        System.out.println();
        System.out.println("Lista ordenada: ");
        System.out.println(companyNameList);

        // Trabalhando com Objetos:

        Company company0 = new Company(companyName0, "Mota", 2);
        Company company1 = new Company(companyName1, "Pedro", 4);
        Company company2 = new Company(companyName2, "Amanda", 5);
        Company company3 = new Company("Bronze Monkey", "Leonardo", 8);
        Company company4 = new Company("Nutty Asteroid", "João", 9);

        ArrayList<Company> companyList = new ArrayList<>();

        companyList.add(company4);
        companyList.add(company1);
        companyList.add(company3);
        companyList.add(company0);
        companyList.add(company2);

        System.out.println();
        System.out.println("Lista:");
        companyList.forEach((company) -> {System.out.println(company);});

        Collections.sort(companyList); // Sort com o Override da interface Comparable (no objeto)
        System.out.println();
        System.out.println("Lista com ordem natural:");
        companyList.forEach((company) -> {System.out.println(company);});

        // Pode usar o sort do Collections passando um Comparator como parâmetro (usado pra fazer sort diferentes do natural)
        //  "ordene estas companies utilizando como comparação o retorno do método getFactory de cada Company"
        Collections.sort(companyList, Comparator.comparing(Company::getFactory)); //A sintaxe :: soluciona uma seleção de forma static -?-
        companyList.sort(Comparator.comparing(Company::getFactory)); // Forma de se fazer a mesma coisa com Java 8

        System.out.println();
        System.out.println("Lista com comparator:");
        companyList.forEach((company) -> {System.out.println(company);});



        
    }
}
