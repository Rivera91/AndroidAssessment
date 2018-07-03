package nyc.c4q.calendarapp;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Calendar;

public class MonthPresenter {


    public View getMonthView(int itemPosition, Activity activity, ViewGroup container){
        View monthView = null;

        switch (itemPosition){
            case 0: monthView = activity.getLayoutInflater().inflate(R.layout.january_pager_item, container,false);
                break;
            case 1: monthView = activity.getLayoutInflater().inflate(R.layout.feb_pager_item, container,false);
                break;
            case 2: monthView = activity.getLayoutInflater().inflate(R.layout.march_pager_item, container,false);
                break;
            case 3: monthView = activity.getLayoutInflater().inflate(R.layout.april_pager_item, container,false);
                break;
            case 4: monthView = activity.getLayoutInflater().inflate(R.layout.may_pager_item, container,false);
                break;
            case 5: monthView = activity.getLayoutInflater().inflate(R.layout.june_pager_item, container,false);
                break;
            case 6: monthView = activity.getLayoutInflater().inflate(R.layout.july_pager_item, container,false);
                break;
            case 7: monthView = activity.getLayoutInflater().inflate(R.layout.august_pager_item, container,false);
                break;
            case 8: monthView = activity.getLayoutInflater().inflate(R.layout.sept_pager_item, container,false);
                break;
            case 9: monthView = activity.getLayoutInflater().inflate(R.layout.october_pager_item, container,false);
                break;
            case 10: monthView = activity.getLayoutInflater().inflate(R.layout.november_pager_item, container,false);
                break;
            case 11: monthView = activity.getLayoutInflater().inflate(R.layout.december_pager_item, container,false);
                break;
        }

        return monthView;
    }

    public void currentDayHighlight(View viewMonth, TextView dayView, Calendar calendar){
        int currentDay = calendar.get(Calendar.DAY_OF_MONTH);

    }

}
