package ru.teach.skype.work;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * - ������, �����, �����, ���, ��������
 * - ������, �����, �����, ���
 * - ������, �����
 * - �����, �����, ���, ��������
 * - �����, �����, ���
 * - �����
 */
public class PatternHomeAddress {
    public static void main(String[] args) {
        String[] addressList = {
                "123765, London, Folgate, 123 / 5", "123765, London, Folgate, 123", "123765, London", "London, Folgate, 123 / 5", "London, Folgate, 123", "London,"
        };

        String indexPattern = "\\d+";
        String pattern = "(\\d[,])?[\\W]?[A-Za-z]+([,][\\W]?[A-Za-z]+[,]?[\\W]?)?(\\d+[\\W]?[//]?[\\W]?)?(\\d+)?";

        Pattern p = Pattern.compile(pattern);
        for(String address: addressList){
            Matcher matcher = p.matcher(address);
            while(matcher.find()){
                System.out.println(matcher.groupCount() + " - "+ matcher.group());
            }
        }
//        for (String address : addressList) {
//            Matcher matcher = p.matcher(address);
//            if (matcher.matches()) {
//                System.out.println(address);
//            }
        }
}
