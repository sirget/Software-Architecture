public class Follower implements Observer {
    private String followerName;

    public Follower(String followerName) {
        this.followerName = followerName;
    }

    public String getFollowerName() {
        return followerName;
    }

    public void setFollowerName(String followerName) {
        this.followerName = followerName;
    }

    public void update(String status) {
        // ส่งข้อความให้ผู้ติดตามว่าเรากำลังไลฟ์อยู่
    }

    public void play() {
        // เล่น channel
    }
}
