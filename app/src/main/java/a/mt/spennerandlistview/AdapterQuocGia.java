package a.mt.spennerandlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.List;

public class AdapterQuocGia extends BaseAdapter {

    int myLayou;
    Context context;
    List<QuocGia> listQuocGia;


    public AdapterQuocGia( Context context, int myLayou,List<QuocGia> listQuocGia) {
        this.myLayou = myLayou;
        this.context = context;
        this.listQuocGia = listQuocGia;
    }

    @Override
    public int getCount() {
        return listQuocGia.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView=inflater.inflate(myLayou,null);

        TextView tvName=convertView.findViewById(R.id.tvName);
        TextView tvToaDo=convertView.findViewById(R.id.tvToaDo);
        ImageView imgHinh=convertView.findViewById(R.id.imgHinh);

        QuocGia quocGia=this.listQuocGia.get(position);
        tvName.setText(quocGia.getnName());
        tvToaDo.setText(""+quocGia.getnToaDo());
        imgHinh.setImageResource(quocGia.getnHinh());
        return convertView;
    }
}
