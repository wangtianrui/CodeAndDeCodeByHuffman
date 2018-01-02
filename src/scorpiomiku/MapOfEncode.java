package scorpiomiku;

import java.util.Map;
/*
* 用来存放解码用的MAP，和码
*/
public class MapOfEncode {
    private String encodeString;
    private Map<Character, String> encodeMap;

    public MapOfEncode(String encode, Map<Character, String> encodeMap) {
        this.encodeString = encode;
        this.encodeMap = encodeMap;
    }

    public String getEncodeString() {
        return encodeString;
    }

    public Map<Character, String> getEncodeMap() {
        return encodeMap;
    }
}
