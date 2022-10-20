import java.util.Objects;

public class Member {
    private int memberID;
    private String memberName;

    public Member(int memberID, String memberName){
        this.memberID =memberID;
        this.memberName = memberName;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberID=" + memberID +
                ", memberName='" + memberName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Member){
            Member member = (Member) o;
            if (this.memberID == member.memberID){
                return true;
            }
            else return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return memberID;
    }
}

