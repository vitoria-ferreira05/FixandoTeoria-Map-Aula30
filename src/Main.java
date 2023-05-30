import java.util.*;

    public class Main {
        public static void main(String[] args) {

            // Usando HashMap
            Map<String, String> mapaMatricula = new HashMap<>();
            mapaMatricula.put("123456", "João");
            mapaMatricula.put("987654", "Maria");
            mapaMatricula.put("456789", "Pedro");

            System.out.println("HashMap:");
            for (Map.Entry<String, String> entry : mapaMatricula.entrySet()) {
                System.out.println("Número de matrícula: " + entry.getKey() + ", Nome: " + entry.getValue());
            }
            System.out.println();

            // Usando TreeMap (ordem natural das chaves)
            Map<String, String> mapaMatriculaOrdenado = new TreeMap<>();
            mapaMatriculaOrdenado.put("123456", "João");
            mapaMatriculaOrdenado.put("987654", "Maria");
            mapaMatriculaOrdenado.put("456789", "Pedro");

            System.out.println("TreeMap (ordenado):");
            for (Map.Entry<String, String> entry : mapaMatriculaOrdenado.entrySet()) {
                System.out.println("Número de matrícula: " + entry.getKey() + ", Nome: " + entry.getValue());
            }
            System.out.println();

            // Usando LinkedHashMap (ordem de inserção)
            Map<String, String> mapaMatriculaInsercao = new LinkedHashMap<>();
            mapaMatriculaInsercao.put("123456", "João");
            mapaMatriculaInsercao.put("987654", "Maria");
            mapaMatriculaInsercao.put("456789", "Pedro");

            System.out.println("LinkedHashMap (ordem de inserção):");
            for (Map.Entry<String, String> entry : mapaMatriculaInsercao.entrySet()) {
                System.out.println("Número de matrícula: " + entry.getKey() + ", Nome: " + entry.getValue());
            }
            System.out.println();

            // Usando Hashtable
            Map<String, String> hashtableMatricula = new Hashtable<>();
            hashtableMatricula.put("123456", "João");
            hashtableMatricula.put("987654", "Maria");
            hashtableMatricula.put("456789", "Pedro");


            System.out.println("Hashtable:");
            for (Map.Entry<String, String> entry : hashtableMatricula.entrySet()) {
                System.out.println("Número de matrícula: " + entry.getKey() + ", Nome: " + entry.getValue());
            }
        }
    }




