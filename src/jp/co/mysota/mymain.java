//このソースは、VstoneMagicによって自動生成されました。
//ソースの内容を書き換えた場合、VstoneMagicで開けなくなる場合があります。
package	jp.co.mysota;
import	main.main.GlobalVariable;
import	jp.vstone.RobotLib.*;
import	jp.vstone.sotatalk.*;
import	jp.vstone.sotatalk.SpeechRecog.*;
import	jp.vstone.network.*;
import	com.google.gson.Gson;

public class mymain
{

	public mymain()																										//@<BlockInfo>jp.vstone.block.func.constructor,32,32,96,32,False,1,@</BlockInfo>
	{
																														//@<OutputChild>
																														//@</OutputChild>
	}																													//@<EndOfBlock/>

	//@<Separate/>
	public void main()																									//@<BlockInfo>jp.vstone.block.func,32,208,576,208,False,7,コメント@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		int code=0;																										//@<BlockInfo>jp.vstone.block.variable,96,208,96,208,False,6,break@</BlockInfo>
																														//@<EndOfBlock/>
		String text=null;																								//@<BlockInfo>jp.vstone.block.variable,160,208,160,208,False,5,break@</BlockInfo>
																														//@<EndOfBlock/>
		String baseUrl = "https://www.googleapis.com/language/translate/v2?key=(キー)&source=ja&target=en&q=";	//@<BlockInfo>jp.vstone.block.freeproc,240,208,240,208,False,4,@</BlockInfo>

		String url = baseUrl  + "こんにちは。よろしくね。";
		boolean isSsl = true;

		HttpRequest request = HttpRequest.createGet(url, isSsl);
		HttpResponse response = HttpHelper.HttpProc(request);

		code = response.responseCode;
		if(response.responseBody != null){
		    String body = new String(response.responseBody);
		    Gson gson = new Gson();
		    Translated trans = gson.fromJson(body, Translated.class);
		    text = trans.data.translations[0].translatedText;
		}
																														//@<EndOfBlock/>
		if(code==200)																									//@<BlockInfo>jp.vstone.block.if,336,160,464,160,False,3,コメント@</BlockInfo>
		{
																														//@<OutputChild>
			GlobalVariable.sotawish.Say((String)text,MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);		//@<BlockInfo>jp.vstone.block.talk.say,400,160,400,160,False,2,@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>
		}
		else
		{
																														//@<OutputChild>
																														//@</OutputChild>
		}
																														//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

}
