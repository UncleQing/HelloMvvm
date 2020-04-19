package com.zidian.hellomvvm.utils;


import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;


public class ToastUtils {
    /** 之前显示的内容 */
    private static String oldMsg ;
    /** Toast对象 */
    private static Toast toast = null ;
    /** 第一次时间 */
    private static long oneTime = 0 ;
    /** 第二次时间 */
    private static long twoTime = 0 ;

    public static void showToast(Context context, String message){
        if(toast == null){
            toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show() ;
            oneTime = System.currentTimeMillis() ;
        }else{
            twoTime = System.currentTimeMillis() ;
            if(message.equals(oldMsg)){
                if(twoTime - oneTime > Toast.LENGTH_SHORT){
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show() ;
                }
            }else{
                toast.setGravity(Gravity.CENTER, 0, 0);
                oldMsg = message ;
                toast.show() ;
            }
        }
        oneTime = twoTime ;
    }
}
