package wordcounter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        // 사용자로부터 텍스트 입력 받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("텍스트를 입력하세요: ");
        String inputText = scanner.nextLine().toLowerCase(); // 입력 텍스트를 소문자로 변환

        // 구두점 및 공백 제거
        inputText = inputText.replaceAll("[^a-z ]", "");

        // 단어 빈도를 저장할 맵
        Map<String, Integer> wordCountMap = new HashMap<>();

        // 텍스트를 공백으로 분할하고 단어 빈도 계산
        String[] words = inputText.split(" ");
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        // 결과 출력
        System.out.println("단어 빈도:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
