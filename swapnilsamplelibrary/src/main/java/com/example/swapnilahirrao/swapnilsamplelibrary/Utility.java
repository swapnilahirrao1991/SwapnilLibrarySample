package com.example.swapnilahirrao.swapnilsamplelibrary;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.provider.MediaStore;
import android.provider.Settings;
import android.support.annotation.NonNull;
//import android.support.design.widget.CoordinatorLayout;
//import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

//import com.google.android.gms.common.ConnectionResult;
//import com.google.android.gms.common.GoogleApiAvailability;
//import com.google.gson.Gson;
//import com.google.gson.reflect.TypeToken;
//import com.noeticnomads.activities.EmpNotificationActivity;
//import com.noeticnomads.dataobject.AppInstance;
//import com.noeticnomads.dataobject.CandidateProfile;
//import com.noeticnomads.helpers.TransparentProgressDialog;
//import com.noeticnomads.mcbiandroid.R;
//import com.nostra13.universalimageloader.core.DisplayImageOptions;
//import com.nostra13.universalimageloader.core.ImageLoader;
//import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
//import com.nostra13.universalimageloader.core.assist.FailReason;
//import com.nostra13.universalimageloader.core.listener.SimpleImageLoadingListener;

import org.json.JSONException;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import sdei.support.lib.communication.HttpUtility;


/**
 * Created by Anurag Sethi
 * This class is used to define the common functions to be used in the application
 */
public class Utility {

    Context context;
//    TransparentProgressDialog progressDialogObj;
    private  Uri mImageUri;
//    ImageLoader imageLoader;
//    DisplayImageOptions options;
    Bitmap imageBitmap = null;
    public ArrayAdapter<String> spinnerArrayAdapter;
    /**
     * Constructor
     * @param contextObj  The Context from where the method is called
     * @return none
     */

//    public Utility(Context contextObj) {
//        context = contextObj;
//        imageLoader = ImageLoader.getInstance();
//        imageLoader.init(ImageLoaderConfiguration.createDefault(contextObj));
//        options = new DisplayImageOptions.Builder() .showImageOnLoading(R.drawable.upload_image) .
//                showImageForEmptyUri(R.drawable.upload_image) .showImageOnFail(R.drawable.upload_image)
//                .cacheInMemory(true).cacheOnDisk(true).considerExifParams(true).
//                        bitmapConfig(Bitmap.Config.RGB_565).build();
//    }


    public boolean checkPasswordCustom(String password) {
        Pattern sPattern;
        Matcher m;
//        final String PASSWORD_PATTERN = " ^(?=.*[a-z])(?=.*[A-Z])(?=.*\\\\d)[a-zA-Z!@#$%^&*?<>{}()~_\\\\d]{8,}$";
        final String PASSWORD_PATTERN = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z!@#$%^&*?<>{}()~_\\d]{6,}$";
        sPattern = Pattern.compile(PASSWORD_PATTERN);
        m = sPattern.matcher(password);
        return m.matches();

    }

    /**
     * The method validates email address
     * @param email email address to validate
     * @return true if the email entered is valid
     */
     public boolean checkEmail(String email) {
        Pattern pattern;
        Matcher matcher;
        final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

    /**
     * This method will convert object to Json String
     * @param obj Object whose data needs to be converted into JSON String
     * @return object data in JSONString
     */
//    public String convertObjectToJson(Object obj) {
//        Gson gson = new Gson();
//        return gson.toJson(obj);
//    }


    /**
     * The method will start the loader till the AsynTask completes the assigned task
     * @since 2014-08-20
     * @param context The Context from where the method is called
     * @param image_for_rotation_resource_id resourceID of the image to be displayed as loader
     * @return none
     */
//    public void startLoader(Context context, int image_for_rotation_resource_id) {
//        progressDialogObj = new TransparentProgressDialog(this.context, image_for_rotation_resource_id);
//
//        progressDialogObj.show();
//    }

    /**
     * The method will start the loader till the AsynTask completes the assigned task
     * @since 2014-08-20
     * @return none
     */
//    public void stopLoader() {
//       // AppInstance.logObj.printLog("stopLoader=" + progressDialogObj);
//        progressDialogObj.dismiss();
//    }




    /**
     * The method will create an alertDialog box
     * @param context The Context from where the method is called
     * @param title  of the dialog box
     * @param msgToShow message to be shown in the dialog box
     * @param positiveBtnText text to be shown in the positive button
     * @param negativeBtnText text to be shown in the negative button
     * @param btnTagName to differentiate the action on the displayed activity
     * @param data to be posted on click of a button
     * @return none
     */
//    public void showAlertDialog(final Context context, String title, String msgToShow, String positiveBtnText, String negativeBtnText, final String btnTagName, final int data) {
//
//        AlertDialog.Builder dialogObj = new AlertDialog.Builder(context);
//        dialogObj.setIcon(android.R.drawable.ic_dialog_alert);
//        dialogObj.setTitle(title);
//        dialogObj.setMessage(msgToShow);
//        dialogObj.setPositiveButton(positiveBtnText, new DialogInterface.OnClickListener(){
//
//            @Override
//            public void onClick(DialogInterface dialog, int whichButton) {
//                // TODO Auto-generated method stub
//                // Show location settings when the user acknowledges the alert dialog
//               if(btnTagName.equalsIgnoreCase("network services")) {
//                    Intent intent = new Intent(Settings.ACTION_DATA_ROAMING_SETTINGS);
//                    context.startActivity(intent);
//                }if(btnTagName.equalsIgnoreCase("NOTIFICATION")){
//                    Intent notification=new Intent(context,EmpNotificationActivity.class);
//                    Bundle notificationBundle = new Bundle();
//                    notificationBundle.putString(Constants.BundleKeyTag.NAV_TAG,Constants.BundleKeyTag.EMP_NOTIFICTION_NAME);
//                    notification.putExtras(notificationBundle);
//                    context.startActivity(notification);
//                }
//
//
//
//            }
//
//        });

//        if(negativeBtnText != null) {
//            dialogObj.setNegativeButton(negativeBtnText, new DialogInterface.OnClickListener() {
//
//                @Override
//                public void onClick(DialogInterface dialog, int which) {
//                    // TODO Auto-generated method stub
//
//                }
//            });
//        }
//
//        dialogObj.show();
//
//    }

    /**
     * The method will return the date and time in requested format
     * @param selectedDateTime to be converted to requested format
     * @param requestedFormat  the format in which the provided datetime needs to be changed
     * @param formatString differentiate parameter to format date or time
     * @return formated date or time
     */
//    public String formatDateTime(String selectedDateTime, String requestedFormat,String formatFromServer, String formatString) {
//
//
//        String userSelectedDatetime ="";
//
//
//
//        try {
//
//            if(selectedDateTime != null ){
//                userSelectedDatetime =selectedDateTime;
//            }
//
//            if (formatString.equalsIgnoreCase(Constants.DataTimeFormat.TIME_TAG)) {
//                SimpleDateFormat ft = new SimpleDateFormat(formatFromServer);
//                Date dateObj = null;
//
//                try {
//                    dateObj = ft.parse(userSelectedDatetime);
//                } catch (ParseException e) {
//                    // TODO Auto-generated catch block
//                    e.printStackTrace();
//                }
//
//                long millis = dateObj.getTime();
//                SimpleDateFormat simpleDateFormatObj = new SimpleDateFormat(requestedFormat);
//                return simpleDateFormatObj.format(millis);
//
//            }//if
//            else if (formatString.equalsIgnoreCase(Constants.DataTimeFormat.DATE_TAG)) {
//                SimpleDateFormat ft = new SimpleDateFormat(formatFromServer);
//                Date dateObj = null;
//
//                try {
//                    dateObj = ft.parse(userSelectedDatetime);
//
//                } catch (ParseException e) {
//                    // TODO Auto-generated catch block
//                    e.printStackTrace();
//                }
//
//                SimpleDateFormat simpleDateFormatObj = new SimpleDateFormat(requestedFormat);
//                return simpleDateFormatObj.format(dateObj);
//
//
//            }
//
//        }catch (NullPointerException npe){
//
//            npe.printStackTrace();
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
//        return null;
//    }



//    public void showError(CoordinatorLayout coordinatorLayout, String message) {
//
//        try {
//            Snackbar snackbar = Snackbar.make(coordinatorLayout, message, Snackbar.LENGTH_LONG);
//            View sbView = snackbar.getView();
//            TextView textView = (TextView) sbView.findViewById(android.support.design.R.id.snackbar_text);
//            textView.setTextColor(Color.RED);
//            snackbar.show();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }


//    public void shakeView(View view) {
//        Animation shake = AnimationUtils.loadAnimation(context, R.anim.shake);
//        view.startAnimation(shake);
//    }
    /**
     * This method will convert json String to ArrayList
     * @since 2014-08-13
     * @param jsonString string which needs to be converted to ArrayList
     * @return ArrayList of type String
     * @throws JSONException
     */
//    private ArrayList<String> convertJsonStringToArray(String jsonString) throws JSONException {
//        Gson gson= null;
//        Type collectionType = null;
//        try {
//             gson = new Gson();
//            ArrayList<String> stringArray = new ArrayList<String>();
//            collectionType = new TypeToken<Collection<String>>() {
//            }.getType();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return gson.fromJson(jsonString,collectionType);
//    }


    /**
     * The method will save the data in shared preferences defined by "sharedPrefName" and the key provided by "key" parameter
     * @since 2014-08-13
     * @param sharedPrefName name of the container
     * @param mode private
     * @param key name of the key in which values are saved
     * @param value data to be saved associated to the particular key
     * @return none
     */

    public void saveDataInSharedPreferences(String sharedPrefName, int mode, String key, String value){
       try {
           SharedPreferences prefsObj = context.getSharedPreferences(sharedPrefName, mode);
           SharedPreferences.Editor editorObj = prefsObj.edit();
           editorObj.putString(key, value);
           editorObj.commit();
       }catch (Exception e){
           e.printStackTrace();
       }
    }

    /**
     * The method will read the data in shared preferences defined by "sharedPrefName" and the key provided by "key" parameter
     * @param sharedPrefName name of the container
     * @param mode private
     * @param key name of the key in which values are saved
     * @return String
     */

    public String readDataInSharedPreferences(String sharedPrefName, int mode, String key) {
        SharedPreferences prefsObj = null;
        try {
            prefsObj = context.getSharedPreferences(sharedPrefName, mode);

        }catch (Exception e){
            e.printStackTrace();
        }

        return prefsObj.getString(key, "");
    }

    /**
     * The method will remove the data stored in shared preferences defined by "sharedPrefName" and the key provided by "key" parameter
     * @param sharedPrefName name of the container
     * @param mode private
     * @param key name of the key in which values are saved
     * @param removeAll if true will remove all the values stored in shared preferences else remove as specified by key
     */
    public void removeKeyFromSharedPreferences(String sharedPrefName, int mode, String key, boolean removeAll) {
       try {
           SharedPreferences prefsObj = context.getSharedPreferences(sharedPrefName, mode);
           SharedPreferences.Editor editorObj = prefsObj.edit();
           if (removeAll) {
               editorObj.clear();
           } else {
               editorObj.remove(key);
           }
           editorObj.commit();
       }catch (Exception e){
           e.printStackTrace();
       }
    }
    
    /**
     * show message to user using showToast
     *
     * @param mContext contains context of application
     * @param message  contains text/message to show
     * @param durationForMessageToAppear 1 will show the message for short duration else long duration
     */
    public void showToast(Context mContext, String message, int durationForMessageToAppear) {
        if(durationForMessageToAppear == 1) {
            Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(mContext, message, Toast.LENGTH_LONG).show();
        }

    }

    /**
     * This method will hide virtual keyboard if opened
     *
     * @param mContext contains context of application
     */
    public void hideVirtualKeyboard(Context mContext) {

        try {

            IBinder binder = ((Activity) mContext).getWindow().getCurrentFocus()
                    .getWindowToken();

            if (binder != null) {
                InputMethodManager imm = (InputMethodManager) mContext.getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(binder, 0);
            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    /**
     * This method will show virtual keyboard where ever required
     *
     * @param mContext contains context of application
     */
    public void showVirtualKeyboard(Context mContext) {
        InputMethodManager imm = (InputMethodManager) mContext.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
    }

    /**
     * Format value up to 2 decimal places
     * @param num - number to be formatted
     */
    public float formatValueUpTo2Decimals(double num) {

        try {

            DecimalFormat df = new DecimalFormat("#.##");

            String value = df.format(num);
            String decimalPlace = ",";

            if (value.contains(decimalPlace)) {
                value = value.replace(decimalPlace, ".");
            }

            return Float.parseFloat(value);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return (float) num;

    }
    
    /**
     * The method validates if GooglePlayServices are available or not
     * @param context - contains the context of the activity from where it is called
     * @return true if GooglePlayServices exists else false
     */

//    public boolean validateGooglePlayServices(Context context) {
//
//        GoogleApiAvailability api = GoogleApiAvailability.getInstance();
//        int resultCode = api.isGooglePlayServicesAvailable(context);
//        if (resultCode != ConnectionResult.SUCCESS) {
//            if (api.isUserResolvableError(resultCode)) {
//                api.getErrorDialog((Activity)context,Constants.GooglePlayService.PLAY_SERVICES_RESOLUTION_REQUEST,resultCode).show();
//            } else {
//                AppInstance.logObj.printLog(context.getResources().getString(R.string.device_not_supported));
//            }
//            return false;
//        }
//        return true;
//
//    }

//    public  void setAdapterOnSpinner(Context context,String array[],Spinner spinner,final int color){
//        spinnerArrayAdapter = new ArrayAdapter<String>(context,  R.layout.spinner_layout, array){
//
//            @NonNull
//            @Override
//            public View getView(int position, View convertView, ViewGroup parent) {
//                View view = super.getView(position, convertView, parent);
//                TextView text = (TextView) view.findViewById(android.R.id.text1);
//                text.setTextColor(color);
//                return view;
//            }
//
//
//
//        };
//
//
//       /* try {
//           Field popup = Spinner.class.getDeclaredField("mPopup");
//            popup.setAccessible(true);
//
//            // Get private mPopup member variable and try cast to ListPopupWindow
//            android.widget.ListPopupWindow popupWindow = (android.widget.ListPopupWindow) popup.get(spinner);
//
//            // Set popupWindow height to 500px
//            popupWindow.setHeight(500);
//            spinner.setDropDownVerticalOffset(30);
//
//        }
//        catch (Exception ex){
//            // Failed...
//        }*/
//
//        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down view
//
//        spinner.setAdapter(spinnerArrayAdapter);
//
//    }

//    public  void setAdapterOnSpinner(Context context, List<String> array, Spinner spinner,final int color){
//        spinnerArrayAdapter = new ArrayAdapter<String>(context,R.layout.spinner_layout, array){
//
//                @NonNull
//                @Override
//                public View getView(int position, View convertView, ViewGroup parent) {
//                    View view = super.getView(position, convertView, parent);
//                    TextView text = (TextView) view.findViewById(android.R.id.text1);
//                    text.setTextColor(color);
//                    return view;
//                }
//
//            };
//
//
//      /*  try {
//            Field popup = Spinner.class.getDeclaredField("mPopup");
//            popup.setAccessible(true);
//
//            // Get private mPopup member variable and try cast to ListPopupWindow
//            android.widget.ListPopupWindow popupWindow = (android.widget.ListPopupWindow) popup.get(spinner);
//
//            popupWindow.setWidth(spinner.getWidth());
//            // Set popupWindow height to 500px
//            popupWindow.setHeight(500);
//            spinner.setDropDownVerticalOffset(100);
//            spinner.setAdapter(spinnerArrayAdapter);
//        }
//        catch (Exception ex){
//            ex.printStackTrace();
//        }*/
//
//        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down view
//        spinner.setAdapter(spinnerArrayAdapter);
//    }


    public  String encodeTobase64(Bitmap image)
    {
        Bitmap immagex=image;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        immagex.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] b = baos.toByteArray();
        String imageEncoded = Base64.encodeToString(b, Base64.NO_WRAP);

        Log.e("ImageEncoded", imageEncoded);
        return imageEncoded;
    }


    public  Bitmap decodeBase64(String input)
    {Bitmap mutableBitmap =null;

        byte[] decodedByte = Base64.decode(input, Base64.NO_WRAP);
        Bitmap workingBitmap = BitmapFactory.decodeByteArray(decodedByte, 0, decodedByte.length);

        mutableBitmap = workingBitmap.copy(Bitmap.Config.ARGB_8888, true);

        return mutableBitmap;

    }



    /**
     * The method will return the network availability
     * @param context context of the activity from which the method is called
     * @return true if network is available else false
     */
//    public boolean isNetworkAvailable(Context context) {
//        HttpUtility httpUtilObj = new HttpUtility(context);
//        return httpUtilObj.isNetworkAvailable();
//    }



//    public Bitmap setIMage(String imagePath, final ImageView imageView,final View progressBar){
//        imageLoader.displayImage(imagePath,imageView,options,new SimpleImageLoadingListener(){
//
//            public void onLoadingStarted(String imageUri, View view) {
//            if(progressBar != null) {
//                progressBar.setVisibility(View.VISIBLE);
//            }
//        }
//
//        @Override
//        public void onLoadingFailed(String imageUri, View view, FailReason failReason) {
//            if(progressBar != null && imageView != null) {
//                progressBar.setVisibility(View.GONE);
//                imageView.setImageResource(R.drawable.upload_image);
//            }
//        }
//
//        @Override
//        public void onLoadingComplete(String imageUri, View view,
//                Bitmap loadedImage) {
//            if(progressBar !=null) {
//                progressBar.setVisibility(View.GONE);
//            }
//            imageBitmap = loadedImage;
//        }
//    });
//
//    return imageBitmap;
//        }


//    public void setJobSeekerSharedPreferenceData(CandidateProfile candidateProfile){
//
//
//        saveDataInSharedPreferences(Constants.SharedPreferenceTag.TAG_PREFERENCE_NAME,
//                context.MODE_PRIVATE, Constants.SharedPreferenceTag.TAG_PREFERENCE_USER_NAME, candidateProfile.getName());
//        saveDataInSharedPreferences(Constants.SharedPreferenceTag.TAG_PREFERENCE_NAME,
//                context.MODE_PRIVATE, Constants.SharedPreferenceTag.TAG_OVERVIEW, candidateProfile.getOverview());
//        saveDataInSharedPreferences(Constants.SharedPreferenceTag.TAG_PREFERENCE_NAME,
//                context.MODE_PRIVATE, Constants.SharedPreferenceTag.TAG_PREFERENCE_FIRST_NAME, candidateProfile.getFirstName());
//        saveDataInSharedPreferences(Constants.SharedPreferenceTag.TAG_PREFERENCE_NAME,
//                context.MODE_PRIVATE, Constants.SharedPreferenceTag.TAG_PREFERENCE_LAST_NAME, candidateProfile.getLastName());
//        saveDataInSharedPreferences(Constants.SharedPreferenceTag.TAG_PREFERENCE_NAME,
//                context.MODE_PRIVATE, Constants.SharedPreferenceTag.TAG_PREFERENCE_CITY_NAME, candidateProfile.getCity_name());
//        saveDataInSharedPreferences(Constants.SharedPreferenceTag.TAG_PREFERENCE_NAME,
//                context.MODE_PRIVATE, Constants.SharedPreferenceTag.TAG_PREFERENCE_STATE_NAME, candidateProfile.getState_name());
//        saveDataInSharedPreferences(Constants.SharedPreferenceTag.TAG_PREFERENCE_NAME,
//                context.MODE_PRIVATE, Constants.SharedPreferenceTag.TAG_PREFERENCE_CITY_ID, candidateProfile.getCity_id());
//        saveDataInSharedPreferences(Constants.SharedPreferenceTag.TAG_PREFERENCE_NAME,
//                context.MODE_PRIVATE, Constants.SharedPreferenceTag.TAG_PREFERENCE_STATE_ID,candidateProfile.getState_id());
//        saveDataInSharedPreferences(Constants.SharedPreferenceTag.TAG_PREFERENCE_NAME,
//                context.MODE_PRIVATE, Constants.SharedPreferenceTag.TAG_PREFERENCE_DESIGNATION,candidateProfile.getDesignation());
//        saveDataInSharedPreferences(Constants.SharedPreferenceTag.TAG_PREFERENCE_NAME,
//                context.MODE_PRIVATE, Constants.SharedPreferenceTag.TAG_CONTACT_NUMBER, candidateProfile.getContact_no());
//        saveDataInSharedPreferences(Constants.SharedPreferenceTag.TAG_PREFERENCE_NAME,
//                context.MODE_PRIVATE, Constants.SharedPreferenceTag.TAG_PREFERENCE_PROFILE_IMAGE, candidateProfile.getProfile_pic());
//        saveDataInSharedPreferences(Constants.SharedPreferenceTag.TAG_PREFERENCE_NAME,
//                context.MODE_PRIVATE, Constants.SharedPreferenceTag.TAG_PREFERENCE_USER_ID,candidateProfile.getId());
//        saveDataInSharedPreferences(Constants.SharedPreferenceTag.TAG_PREFERENCE_NAME,
//                context.MODE_PRIVATE, Constants.SharedPreferenceTag.TAG_PREFERENCE_SECURITY_KEY, candidateProfile.getSecurity_key());
//        saveDataInSharedPreferences(Constants.SharedPreferenceTag.TAG_PREFERENCE_NAME,
//                context.MODE_PRIVATE, Constants.SharedPreferenceTag.TAG_PREFERENCE_ROLE_ID, candidateProfile.getRole_id());
//        saveDataInSharedPreferences(Constants.SharedPreferenceTag.TAG_PREFERENCE_NAME,
//                context.MODE_PRIVATE, Constants.SharedPreferenceTag.TAG_PREFERENCE_EMAIL, candidateProfile.getEmail());
//        saveDataInSharedPreferences(Constants.SharedPreferenceTag.TAG_PREFERENCE_NAME,
//                context.MODE_PRIVATE, Constants.SharedPreferenceTag.TAG_ORGANIZATION_NAME, candidateProfile.getOrganization_name());
//        saveDataInSharedPreferences(Constants.SharedPreferenceTag.TAG_PREFERENCE_NAME,
//                context.MODE_PRIVATE, Constants.SharedPreferenceTag.TAG_ORGANIZATION_DETAIL, candidateProfile.getJob_company_details());
//
//    }




//    public Bitmap setUpNavigationBackground(String imagePath, final ImageView imageView,final View progressBar,final View layout){
//        imageLoader.displayImage(imagePath,imageView,options,new SimpleImageLoadingListener(){
//
//            public void onLoadingStarted(String imageUri, View view) {
//                if(progressBar != null) {
//                    progressBar.setVisibility(View.VISIBLE);
//                }
//            }
//
//            @Override
//            public void onLoadingFailed(String imageUri, View view, FailReason failReason) {
//                if(progressBar != null && imageView != null) {
//                    progressBar.setVisibility(View.GONE);
//                    imageView.setImageResource(R.drawable.upload_image);
//                }
//            }
//
//            @Override
//            public void onLoadingComplete(String imageUri, View view,
//                                          Bitmap loadedImage) {
//                if(progressBar !=null) {
//                    progressBar.setVisibility(View.GONE);
//
//                }
//                imageBitmap = loadedImage;
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                    layout.setBackgroundResource(R.drawable.background);
//                }else{
//                    layout.setBackgroundResource(R.drawable.background);
//                }
//            }
//        });
//
//        return imageBitmap;
//    }



//    public void changrFragment(android.support.v4.app.Fragment fragment, Context ctx, Bundle bundle) {
//
//        FragmentTransaction fragmnetTransaction=((AppCompatActivity)ctx).getSupportFragmentManager().beginTransaction();
//
//        if(bundle!=null) {
//            fragment.setArguments(bundle);
//        }
//        if(context.getClass().getName().contains(Constants.FragmentTitleName.TAG_EMPLOYERJOBDETAI)) {
//            fragmnetTransaction.replace(R.id.content, fragment).addToBackStack(fragment.getClass().getName());
//        }else {
//            fragmnetTransaction.replace(R.id.content_employer_dashboard, fragment).addToBackStack(fragment.getClass().getName());
//        }
//        fragmnetTransaction.commit();
//
//    }


//    public void changrDetailFragment(android.support.v4.app.Fragment fragment, Context ctx, Bundle bundle) {
//
//        FragmentTransaction fragmnetTransaction=((AppCompatActivity)ctx).getSupportFragmentManager().beginTransaction();
//
//        if(bundle!=null) {
//            fragment.setArguments(bundle);
//        }
//        if(context.getClass().getName().contains(Constants.FragmentTitleName.TAG_EMPLOYERJOBDETAI)) {
//            fragmnetTransaction.replace(R.id.content, fragment).addToBackStack(fragment.getClass().getName());
//        }else{
//            fragmnetTransaction.replace(R.id.content_employer_dashboard, fragment).addToBackStack(fragment.getClass().getName());
//        }
//
//        fragmnetTransaction.commit();
//
//    }

    public  int getColor(Context context, int id) {
        final int version = Build.VERSION.SDK_INT;
        if (version >= 23) {
            return ContextCompat.getColor(context, id);
        } else {
            return context.getResources().getColor(id);
        }
    }
//    public void getImageSelectionDialog() {
//
//        final Dialog customDialog = new Dialog(context);
//        customDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
//        customDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//        customDialog.setContentView(R.layout.camera_dialog);
//        TextView takePhoto = (TextView) customDialog.findViewById(R.id.takePhoto);
//        TextView choosePicFromGallery = (TextView) customDialog.findViewById(R.id.chooseePicFromGallery);
//        TextView dialogCloseButton = (TextView) customDialog.findViewById(R.id.dialogCloseButton);
//        TextView cameratitle= (TextView) customDialog.findViewById(R.id.titleCamera);
//
//        cameratitle.setTextColor(ContextCompat.getColor(context,R.color.orange));
//
//        takePhoto.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                customDialog.dismiss();
//                Intent pictureActionIntent = new Intent(
//                        MediaStore.ACTION_IMAGE_CAPTURE);
//                File filePhoto = new File(
//                        android.os.Environment
//                                .getExternalStorageDirectory()
//                                .getAbsolutePath()
//                                + "/" + Constants.CameraRequest.IMAGE_PATH);
//                mImageUri = Uri.fromFile(filePhoto);
//                pictureActionIntent.putExtra(
//                        MediaStore.EXTRA_OUTPUT, mImageUri);
//                ((AppCompatActivity) context).startActivityForResult(pictureActionIntent,
//                        Constants.CameraRequest.REQUEST_CAMERA);
//
//            }
//        });
//
//        choosePicFromGallery.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                customDialog.dismiss();
//                Intent galleryIntent = new Intent(
//                        Intent.ACTION_PICK,
//                        MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
//                ((AppCompatActivity) context).startActivityForResult(galleryIntent,
//                        Constants.CameraRequest.REQUEST_GALLERY);
//
//            }
//        });
//
//        dialogCloseButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                customDialog.dismiss();
//            }
//        });
//        customDialog.show();
//    }




//    public Bitmap getCameraBitmap() {
//        Bitmap imageBitmap = null;
//        if (mImageUri != null) {
//            context.getContentResolver().notifyChange(mImageUri, null);
//            //Bitmap photo = (Bitmap) data.getExtras().get("data");
//            String strPath = String.valueOf(getRealPathFromURI(mImageUri));
//            if (strPath != null) {
//
//                final BitmapFactory.Options options = new BitmapFactory.Options();
//                options.inJustDecodeBounds = true;
//                BitmapFactory.decodeFile(strPath, options);
//
//                // Calculate inSampleSize
//                options.inSampleSize = 2;
//
//                options.inJustDecodeBounds = false;
//
//                Bitmap mBitmap = BitmapFactory.decodeFile(strPath, options);
//                imageBitmap = ExifUtil.rotateBitmap(strPath,
//                        mBitmap);
//            }
//        }
//
//        return  imageBitmap ;
//    }


//    public Bitmap getGallerBitmap(Intent data){
//         Bitmap imageBitmap = null;
//        if (data != null) {
//            BitmapFactory.Options options = new BitmapFactory.Options();
//            options.inSampleSize = 2;
//            File mFile = new File(getPicturePath(data));
//            Bitmap mBitmap = BitmapFactory.decodeFile(mFile.getAbsolutePath(),
//                    options);
//            imageBitmap = ExifUtil.rotateBitmap(
//                    mFile.getAbsolutePath(), mBitmap);
//        }
//
//        return imageBitmap;
//    }


    private String getPicturePath(Intent data) {

        Uri selectedImage = data.getData();
        String[] filePathColumn = { MediaStore.Images.Media.DATA };
        Cursor cursor = context.getContentResolver().query(selectedImage,
                filePathColumn, null, null, null);
        cursor.moveToFirst();
        int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
        String picturePath = cursor.getString(columnIndex);
        cursor.close();

        return picturePath;
    }

    private String getRealPathFromURI(Uri contentURI) {
        Cursor cursor = context.getContentResolver().query(contentURI, null, null,
                null, null);
        if (cursor == null) { // Source is Dropbox or other similar local file
            // path
            return contentURI.getPath();
        } else {
            cursor.moveToFirst();
            int idx = cursor
                    .getColumnIndex(MediaStore.Images.ImageColumns.DATA);
            return cursor.getString(idx);
        }
    }


//    public void getCustomDialogBox(String title, String text, final String viewType,final boolean closeValue){
//
//        final Dialog customDialog =new Dialog(context);
//        customDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
//        customDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//        customDialog.setContentView(R.layout.custom_dialog);
//        TextView customTitle =(TextView)customDialog.findViewById(R.id.customTitle);
//        TextView dialogText =(TextView)customDialog.findViewById(R.id.dialogText);
//        TextView dialogButton =(TextView)customDialog.findViewById(R.id.dialogButton);
//        customDialog.setCancelable(false);
//        customDialog.show();
//
//        customTitle.setText(title);
//        dialogText.setText(text);
//        dialogButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                customDialog.dismiss();
//
//                if(closeValue){
//                    ((AppCompatActivity)context).onBackPressed();
//                }
//            }
//        });
//
//
//
//
//    }


}
