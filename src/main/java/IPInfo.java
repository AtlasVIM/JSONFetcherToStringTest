public class IPInfo {
    private String ip;
    private String hostname;
    private String city;
    private String region;
    private String country;
    private String loc;
    private String org;
    private String postal;
    private String timezone;
    private String readme;


    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getReadme() {
        return readme;
    }

    public void setReadme(String readme) {
        this.readme = readme;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("IP: ")
                .append(this.ip + "\n")
                .append("Hostname: ")
                .append(this.hostname + "\n")
                .append("City: ")
                .append(this.city + "\n")
                .append("Region: ")
                .append(this.region + "\n")
                .append("Country: ")
                .append(this.country + "\n")
                .append("LOC: ")
                .append(this.loc + "\n")
                .append("ORG: ")
                .append(this.org + "\n")
                .append("Postal: ")
                .append(this.postal + "\n")
                .append("Timezone: ")
                .append(this.timezone + "\n")
                .append("Read Me: ")
                .append(this.readme);


        return builder.toString();
    }
}


