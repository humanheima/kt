

/**
 * Description:<br>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0<br>
 */
// ���庯�����ú����ķ���ֵ����Ϊ(Int) -> Int
fun getMathFuncLambda(type: String) : (Int) -> Int {
	// �ú������ص���Lambda���ʽ
	when(type) {
		"square" -> return {n: Int ->  // ��
				n * n
			}
		"cube" -> return {n: Int ->  // ��
				n * n * n
			}
		else -> return {n: Int ->  // ��
				var result = 1
				for ( index in 2..n ){
					result *= index
				}
				result
			}
	}
}
fun main(args: Array<String>) {
	// ����getMathFunc()�����򷵻�һ��(Int)->Int���͵ĺ���
	var mathFunc = getMathFuncLambda("cube") // �õ�cube����
	println(mathFunc(5)) // ���125
	mathFunc = getMathFuncLambda("square") // �õ�square����
	println(mathFunc(5)) // ���25
	mathFunc = getMathFuncLambda("reference") // �õ�factorial����
	println(mathFunc(5)) // ���120
}