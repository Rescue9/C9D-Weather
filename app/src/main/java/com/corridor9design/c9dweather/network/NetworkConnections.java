package com.corridor9design.c9dweather.network;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;

public class NetworkConnections {
    public static boolean isInternetConnected(Context context) {
    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        Network nw = connectivityManager.getActiveNetwork();
}
