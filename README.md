# TopBottomSnackBar

A library show snack bar from top or bottom(Android),you can use it like google's SnackBar.

![此处输入图片的描述][1]


  [1]: https://github.com/wypeng2012/TopBottomSnackBar/blob/master/screenpic/ScreenGif.gif
  
[ ![Download](https://api.bintray.com/packages/loveit/maven/topbottomsnackbar/images/download.svg?version=1.1.0) ](https://bintray.com/loveit/maven/topbottomsnackbar/1.1.0/link)


#support api >= 14
 

 - **use it**
 
1.TBSnackbar.STYLE_SHOW_TOP
  
        /* if you use STYLE_SHOW_TOP and your activity has toolbar or
            actionbar ,you should use "findViewById(android.R.id.content)",must
            not use "getWindow().getDecorView()"*/
        TBSnackbar.make(findViewById(android.R.id.content), "This is a top snack!", TBSnackbar.LENGTH_SHORT, TBSnackbar.STYLE_SHOW_TOP).show();

  2.TBSnackbar.STYLE_SHOW_BOTTOM
    
        // if you use STYLE_SHOW_BOTTOM  ,you can use any view.But if you use
        //CoordinatorLayout,you must use CoordinatorLayout.
        
        TBSnackbar.make(findViewById(android.R.id.content), "This is a bottom snack!", TBSnackbar.LENGTH_SHORT,TBSnackbar.STYLE_SHOW_BOTTOM).show();

 3.TBSnackbar.STYLE_SHOW_TOP_FITSYSTEMWINDOW
 
    
        // if you use STYLE_SHOW_TOP_FITSYSTEMWINDOW ,you must use
        //getWindow().getDecorView()  android api >= 19 
        
        TBSnackbar.make(getWindow().getDecorView(),"This is a fitsystemwindow snack!", TBSnackbar.LENGTH_SHORT,TBSnackbar.STYLE_SHOW_TOP_FITSYSTEMWINDOW).show();

   4.use it with icon
   
        //setIconLeft(@DrawableRes int drawableRes, float sizeDp) the size is dp,24dp is ok
        //if you want change the icon padding you can use setIconPadding(int padding)
        //setIconRight(@DrawableRes int drawableRes, float sizeDp) you can use 
        
        TBSnackbar snackbar = TBSnackbar.make(findViewById(android.R.id.content), "This is a left icon snack!", TBSnackbar.LENGTH_SHORT, TBSnackbar.STYLE_SHOW_TOP);
            snackbar.setIconLeft(R.mipmap.ic_core,24);
            snackbar.show();

 5.use it with action

        //you can use it like google's SnackBar 
        final TBSnackbar snackbar = TBSnackbar.make(findViewById(android.R.id.content), "This is a action snack!", TBSnackbar.LENGTH_INDEFINITE, TBSnackbar.STYLE_SHOW_TOP);
                snackbar.setAction("Action", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        snackbar.dismiss();
                    }
                });
                snackbar.show();

 - **How to dependencies**
 
 1.Maven

        <dependency>  
               <groupId>com.github</groupId>  
               <artifactId>topbottomsnackbar</artifactId> 
               <version>1.1.0</version> 
               <type>pom</type> 
        </dependency>

 2.Gradle 

        compile 'com.github:topbottomsnackbar:1.1.0'

 3.Ivy

        <dependency org='com.github' name='topbottomsnackbar' rev='1.1.0'>
          <artifact name='$AID' ext='pom'></artifact>
        </dependency>

 - **License**

        Copyright 2017 52it.party
        
        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at
        
           http://www.apache.org/licenses/LICENSE-2.0
        
        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.

 
  
  