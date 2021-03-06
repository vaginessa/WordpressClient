
package ir.omidtaheri.wpclient.data.network.model.Posts;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostTag implements Parcelable
{

    @SerializedName("term_id")
    @Expose
    private int termId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("link")
    @Expose
    private String link;
    public final static Creator<PostTag> CREATOR = new Creator<PostTag>() {


        @SuppressWarnings({
            "unchecked"
        })
        public PostTag createFromParcel(Parcel in) {
            return new PostTag(in);
        }

        public PostTag[] newArray(int size) {
            return (new PostTag[size]);
        }

    }
    ;

    protected PostTag(Parcel in) {
        this.termId = ((int) in.readValue((int.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.link = ((String) in.readValue((String.class.getClassLoader())));
    }

    public PostTag() {
    }

    public int getTermId() {
        return termId;
    }

    public void setTermId(int termId) {
        this.termId = termId;
    }

    public PostTag withTermId(int termId) {
        this.termId = termId;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PostTag withName(String name) {
        this.name = name;
        return this;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public PostTag withLink(String link) {
        this.link = link;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(termId);
        dest.writeValue(name);
        dest.writeValue(link);
    }

    public int describeContents() {
        return  0;
    }

}
