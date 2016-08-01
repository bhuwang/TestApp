package com.example.bhuwan.testapp.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.bhuwan.testapp.R;

public class NotificationActivity extends AppCompatActivity {

    Notification.Builder notification;
    private static final int UNIQUE_ID = 45612;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        notification = new Notification.Builder(this);
        // clean notification once they gets open
        notification.setAutoCancel(true);
    }

    public void onClickNotificationButton(View view) {

        //Build notification
        notification.setSmallIcon(R.drawable.prisha);
        notification.setTicker("This is the flag of Nepal");
        notification.setWhen(System.currentTimeMillis());
        notification.setContentTitle("Nepal Title");
        notification.setContentText("Nepal content should be long enough.");

        Intent intent = new Intent(this, NotificationActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(pendingIntent);

        // Build notification and issue it
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.notify(UNIQUE_ID, notification.build());
    }
}
