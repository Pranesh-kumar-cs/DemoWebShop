<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_test                                   _a55ded</name>
   <tag></tag>
   <elementGuidId>49dcf972-dbac-4060-878d-b4044ab486eb</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>(.//*[normalize-space(text()) and normalize-space(.)='No'])[445]/following::div[1]</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value></value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
      <webElementGuid>2e15726b-0a7c-4925-b8b9-2cb90fb716f5</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>product-review-item</value>
      <webElementGuid>af07f22e-742a-47fe-918d-2a5d6e9f10be</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
                        
                            
                                test
                            
                            
                                
                                    
                                    
                                
                            
                        
                        
                            Hi thiss test
                        
                        
                            
                                From:
Pranesh                            
                            |
                            
                                Date:
                                11/24/2023 6:40 AM
                            
                        
                        
    Was this review helpful?
    
        Yes
        No
    
    
        (0/0)
    
    

    
    
        $(document).ready(function () {
            $('#vote-yes-16327').click(function () {
                setProductReviewHelpfulness16327('true');
            });
            $('#vote-no-16327').click(function () {
                setProductReviewHelpfulness16327('false');
            });
        });

        function setProductReviewHelpfulness16327(wasHelpful){
                $.ajax({
                    cache: false,
                    type: &quot;POST&quot;,
                    url: &quot;/setproductreviewhelpfulness&quot;,
                    data: { &quot;productReviewId&quot;: 16327, &quot;washelpful&quot;: wasHelpful },
                    success: function (data) {
                         $(&quot;#helpfulness-vote-yes-16327&quot;).html(data.TotalYes);
                         $(&quot;#helpfulness-vote-no-16327&quot;).html(data.TotalNo);
                         $(&quot;#helpfulness-vote-result-16327&quot;).html(data.Result);
                                                  
                         $('#helpfulness-vote-result-16327').fadeIn(&quot;slow&quot;).delay(1000).fadeOut(&quot;slow&quot;);
                    },
                    error:function (xhr, ajaxOptions, thrownError){
                        alert('Failed to vote. Please refresh the page and try one more time.');
                    }  
                });
        }
    


                        
                    </value>
      <webElementGuid>124d3242-7022-4488-937e-143bd288be72</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[1]/div[@class=&quot;master-wrapper-page&quot;]/div[@class=&quot;master-wrapper-content&quot;]/div[@class=&quot;master-wrapper-main&quot;]/div[@class=&quot;center-2&quot;]/div[@class=&quot;page product-reviews-page&quot;]/div[@class=&quot;page-body&quot;]/div[@class=&quot;product-review-list&quot;]/div[@class=&quot;product-review-item&quot;]</value>
      <webElementGuid>79ae7740-fb3e-4362-abc5-f9a2ea22257b</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='No'])[445]/following::div[1]</value>
      <webElementGuid>dd5bae9f-d0df-419b-8315-0f36f1336305</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[447]</value>
      <webElementGuid>6821169e-d2d6-4b7c-af34-5c111ad6e2b4</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//div[(text() = concat(&quot;
                        
                            
                                test
                            
                            
                                
                                    
                                    
                                
                            
                        
                        
                            Hi thiss test
                        
                        
                            
                                From:
Pranesh                            
                            |
                            
                                Date:
                                11/24/2023 6:40 AM
                            
                        
                        
    Was this review helpful?
    
        Yes
        No
    
    
        (0/0)
    
    

    
    
        $(document).ready(function () {
            $(&quot; , &quot;'&quot; , &quot;#vote-yes-16327&quot; , &quot;'&quot; , &quot;).click(function () {
                setProductReviewHelpfulness16327(&quot; , &quot;'&quot; , &quot;true&quot; , &quot;'&quot; , &quot;);
            });
            $(&quot; , &quot;'&quot; , &quot;#vote-no-16327&quot; , &quot;'&quot; , &quot;).click(function () {
                setProductReviewHelpfulness16327(&quot; , &quot;'&quot; , &quot;false&quot; , &quot;'&quot; , &quot;);
            });
        });

        function setProductReviewHelpfulness16327(wasHelpful){
                $.ajax({
                    cache: false,
                    type: &quot;POST&quot;,
                    url: &quot;/setproductreviewhelpfulness&quot;,
                    data: { &quot;productReviewId&quot;: 16327, &quot;washelpful&quot;: wasHelpful },
                    success: function (data) {
                         $(&quot;#helpfulness-vote-yes-16327&quot;).html(data.TotalYes);
                         $(&quot;#helpfulness-vote-no-16327&quot;).html(data.TotalNo);
                         $(&quot;#helpfulness-vote-result-16327&quot;).html(data.Result);
                                                  
                         $(&quot; , &quot;'&quot; , &quot;#helpfulness-vote-result-16327&quot; , &quot;'&quot; , &quot;).fadeIn(&quot;slow&quot;).delay(1000).fadeOut(&quot;slow&quot;);
                    },
                    error:function (xhr, ajaxOptions, thrownError){
                        alert(&quot; , &quot;'&quot; , &quot;Failed to vote. Please refresh the page and try one more time.&quot; , &quot;'&quot; , &quot;);
                    }  
                });
        }
    


                        
                    &quot;) or . = concat(&quot;
                        
                            
                                test
                            
                            
                                
                                    
                                    
                                
                            
                        
                        
                            Hi thiss test
                        
                        
                            
                                From:
Pranesh                            
                            |
                            
                                Date:
                                11/24/2023 6:40 AM
                            
                        
                        
    Was this review helpful?
    
        Yes
        No
    
    
        (0/0)
    
    

    
    
        $(document).ready(function () {
            $(&quot; , &quot;'&quot; , &quot;#vote-yes-16327&quot; , &quot;'&quot; , &quot;).click(function () {
                setProductReviewHelpfulness16327(&quot; , &quot;'&quot; , &quot;true&quot; , &quot;'&quot; , &quot;);
            });
            $(&quot; , &quot;'&quot; , &quot;#vote-no-16327&quot; , &quot;'&quot; , &quot;).click(function () {
                setProductReviewHelpfulness16327(&quot; , &quot;'&quot; , &quot;false&quot; , &quot;'&quot; , &quot;);
            });
        });

        function setProductReviewHelpfulness16327(wasHelpful){
                $.ajax({
                    cache: false,
                    type: &quot;POST&quot;,
                    url: &quot;/setproductreviewhelpfulness&quot;,
                    data: { &quot;productReviewId&quot;: 16327, &quot;washelpful&quot;: wasHelpful },
                    success: function (data) {
                         $(&quot;#helpfulness-vote-yes-16327&quot;).html(data.TotalYes);
                         $(&quot;#helpfulness-vote-no-16327&quot;).html(data.TotalNo);
                         $(&quot;#helpfulness-vote-result-16327&quot;).html(data.Result);
                                                  
                         $(&quot; , &quot;'&quot; , &quot;#helpfulness-vote-result-16327&quot; , &quot;'&quot; , &quot;).fadeIn(&quot;slow&quot;).delay(1000).fadeOut(&quot;slow&quot;);
                    },
                    error:function (xhr, ajaxOptions, thrownError){
                        alert(&quot; , &quot;'&quot; , &quot;Failed to vote. Please refresh the page and try one more time.&quot; , &quot;'&quot; , &quot;);
                    }  
                });
        }
    


                        
                    &quot;))]</value>
      <webElementGuid>4010c9a8-8afb-4f54-9420-cfb40f815c1b</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
