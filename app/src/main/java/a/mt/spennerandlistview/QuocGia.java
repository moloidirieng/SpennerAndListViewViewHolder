package a.mt.spennerandlistview;

import java.io.Serializable;

public class QuocGia implements Serializable {
    private String nName;
    private int nToaDo;
    private int nHinh;

    public QuocGia(String nName, int nToaDo, int nHinh) {
        this.nName = nName;
        this.nToaDo = nToaDo;
        this.nHinh = nHinh;
    }

    public QuocGia() {
    }

    public String getnName() {
        return nName;
    }

    public void setnName(String nName) {
        this.nName = nName;
    }

    public int getnToaDo() {
        return nToaDo;
    }

    public void setnToaDo(int nToaDo) {
        this.nToaDo = nToaDo;
    }

    public int getnHinh() {
        return nHinh;
    }

    public void setnHinh(int nHinh) {
        this.nHinh = nHinh;
    }
}
