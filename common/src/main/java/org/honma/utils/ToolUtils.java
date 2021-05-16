package org.honma.utils;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 工具类
 *
 * @author lufangjie
 */
public class ToolUtils {

    public static final String COMMA = ",";

    /**
     * 获取UUID
     *
     * @return String uuid
     */
    public static String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    /**
     * * 判断是否含有特殊字符
     *
     * @param str 被检查的字符串
     * @return true为包含，false为不包含
     */
    public static boolean isSpecialChar(String str) {
        String regEx = "[ _`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]|\n|\r|\t";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        return m.find();
    }

    /**
     * 分割字符串
     *
     * @param str    需要分割的字符串
     * @param symbol 分割的符号
     * @return List 分割后组成的list
     */
    public static List<String> splitToList(String str, String symbol) {
        List<String> list = new ArrayList<>();
        if (StringUtils.isNotBlank(str)) {
            String[] strArr = str.split(symbol);
            for (String element : strArr) {
                list.add(element);
            }
        }
        return list;
    }

    /**
     * windows获取mac地址
     *
     * @param
     * @param
     * @return
     */
    public static String getMACAddressByWindows() throws Exception {
        String result = "";
        Process process = Runtime.getRuntime().exec("ipconfig /all");
        BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream(), "GBK"));

        String line;
        int index = -1;
        while ((line = br.readLine()) != null) {
            index = line.toLowerCase().indexOf("物理地址");
            if (index >= 0) {// 找到了
                index = line.indexOf(":");
                if (index >= 0) {
                    result = line.substring(index + 1).trim();
                }
                break;
            }
        }
        br.close();
        return result;
    }

    /**
     * 生成指定位数的随机数
     *
     * @param length
     * @return
     */
    public static String getRandom(int length) {
        String val = "";
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            val += String.valueOf(random.nextInt(10));
        }
        return val;
    }

    /**
     * 实现首字母大写功能
     * @param str	要转换的字符串
     * @return		首字母大写的字符串
     */
    public static String initcap(String str) {
        if(str == null || "".equals(str)) {
            return str ;
        }
        if(str.length() == 1) {
            return str.toUpperCase();
        }else {
            return str.substring(0,1).toUpperCase()+str.substring(1);
        }

    }

    /**
     * 获取小32位md5
     * @param plainText
     * @return
     */
    public static String encryption(String plainText) {
        String re_md5 = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(plainText.getBytes());
            byte[] b = md.digest();

            int i;

            StringBuffer buf = new StringBuffer();
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }

            re_md5 = buf.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return re_md5;
    }
}
