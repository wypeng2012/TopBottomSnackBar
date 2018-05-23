# commontopbar
A common topBar library.It looks like android's title bar.

![此处输入图片的描述][1]


  [1]: https://github.com/wypeng2012/commontopbar/blob/master/screengif/ScreenGif.gif
  
  
 [ ![Download](https://api.bintray.com/packages/loveit/maven/topbottomsnackbar/images/download.svg?version=1.1.0) ](https://bintray.com/loveit/maven/topbottomsnackbar/1.1.0/link)
 
#**support api >= 14**

 **- Use It**
   1.in layout xml

          <party.loveit.commontopbar.CommonTopBar
                android:id="@+id/common"
                android:layout_width="match_parent"
                android:layout_height="48dp"
                android:background="@color/top_bar_bg_color"/>
                
   2.your activity implements CommonTopBarClick interface,it has two methods
 

         public interface CommonTopBarClick {
                void onClickLeft();//click left view on CommonTopBar
                void onClickRight();//click right view on CommonTopBar
         }
         
    
   3.set the listener in your code
   

        mCommonTopBar = (CommonTopBar) findViewById(R.id.common);
        mCommonTopBar.setCommonTopBarClick(this);//of course you can not set it

   4.show or hiden view
    
        mCommonTopBar.isShowLeftView(true);
        mCommonTopBar.isShowRightView(true);
        
  5.set text on left ,mid ,right view
 

        setLeftText(CharSequence charSequence) //set left view text
        setLeftText(int textRes) //set left view text
        
        setMidText(CharSequence charSequence) //set mid view text
        setMidText(int textRes) //set mid view text
        
        setRightText(CharSequence charSequence) //set right view text
        setRightText(int textRes) //set right view text
        
    
   6.set image on left ,right view
    
        setLeftImage(android.graphics.drawable.Drawable drawable) //set left image
        setLeftImage(int drawableRes) //set left image
        
        setRightImage(android.graphics.drawable.Drawable drawable) //set right image
        setRightImage(int drawableRes) //set right image
    
  7.set text size on left ,mid ,right view
    
 

        setLeftTextSize(float size) //set left text size
           
        setMidTextSize(float size) //set mid text size
           
        setRightTextSize(float size) //set right text size
        
 8.set text color on left ,mid ,right view
    
        setLeftTextColor(android.content.res.ColorStateList colorStateList) //set left text color
        setLeftTextColor(int color) //set left text color
        
        setMidTextColor(android.content.res.ColorStateList colorStateList) //set mid text color
        setMidTextColor(int color) //set mid text color
        
        setRightText(int textRes) //set right view text
        setRightTextColor(android.content.res.ColorStateList colorStateList) //set right text color
        
9.add margin on left,right view
    
        addLeftMargin(float marginLeft) //set left view margin left,the param is dp
        addRightMargin(float marginRight) //set right view margin right,the param is dp
        
 10.control middle text max length 
    
        setMidTextMaxLenth(int lenth) //set middle text max length 
        

 **- How to dependencies**
 
  1.Maven

     <dependency>
      <groupId>party.loveit</groupId>
      <artifactId>commontopbarlibrary</artifactId>
      <version>1.1.0</version>
      <type>pom</type>
    </dependency>
    
 2.Gradle

     compile 'party.loveit:commontopbarlibrary:1.1.0'
     
3.Ivy

    <dependency org='party.loveit' name='commontopbarlibrary' rev='1.1.0'>
      <artifact name='$AID' ext='pom'></artifact>
    </dependency>

 **- License**

     Copyright 2016 52it.party
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
       http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

