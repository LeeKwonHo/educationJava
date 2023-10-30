package wordcounter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KoreanCutter {

	public static void main(String[] args) {
        // 사용자로부터 한국어 텍스트 입력 받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("한국어 텍스트를 입력하세요: ");
        String inputText = scanner.nextLine();

        // 정규 표현식을 사용하여 한국어 단어 추출
        
        Pattern pattern = Pattern.compile("\\b[가-힣ㄱ-ㅎ^a-z]+\\b");
        Matcher matcher = pattern.matcher(inputText);

        // 단어 빈도를 저장할 맵
        Map<String, Integer> wordCountMap = new HashMap<>();

        // 추출한 단어들의 빈도 계산
        while (matcher.find()) {
            String word = matcher.group();
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // 결과 출력
        System.out.println("단어 빈도:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
