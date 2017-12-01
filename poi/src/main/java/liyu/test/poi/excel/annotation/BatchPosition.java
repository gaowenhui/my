package liyu.test.poi.excel.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface BatchPosition {
	/**
	 * 
	 * @Title: x 
	 * @Description: �����꣬��ʼΪA
	 * @return
	 * @return: String
	 */
	public String x();
	/**
	 * 
	 * @Title: nullable 
	 * @Description: �Ƿ����Ϊ��
	 * @return
	 * @return: boolean
	 */
	public boolean nullable() default true;
}
