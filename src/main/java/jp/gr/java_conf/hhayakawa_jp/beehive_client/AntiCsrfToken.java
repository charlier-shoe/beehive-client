package jp.gr.java_conf.hhayakawa_jp.beehive_client;

final class AntiCsrfToken {
    
    private String beeType;
    private String token;

    AntiCsrfToken() {
        super();
    }

    AntiCsrfToken(String beeType, String token) {
        super();
        this.beeType = beeType;
        this.token = token;
    }

    String getBeeType() {
        return beeType;
    }

    void setBeeType(String beeType) {
        this.beeType = beeType;
    }

    String getToken() {
        return token;
    }

    void setToken(String token) {
        this.token = token;
    }

}