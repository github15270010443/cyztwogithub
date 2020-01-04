package com.util;

//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MutiThread implements Runnable{
	/**
	 * ���̸߲߳����첽����
	 */
	@Override
	public void run() {
		System.err.println("���ﴦ������task");
	}
	
	public static void main(String[] args) {
		Thread t=new Thread(new MutiThread());
		Pool p=new Pool();
        p.getInstance().execute(t);
        //ExecutorService fixedThreadPool=Executors.newFixedThreadPool(10);
        //fixedThreadPool.execute(t); 
	}
	
	static class Pool{
		private static ThreadPoolExecutor pool=null;
		private Pool() {}
		public synchronized ThreadPoolExecutor getInstance() {
			if(pool==null) {
				pool=new ThreadPoolExecutor(10,100,2L,TimeUnit.MILLISECONDS,
						new LinkedBlockingQueue<Runnable>(),new ThreadFactory() {
							@Override
							public Thread newThread(Runnable r) {
								Thread t=new Thread(r);
								t.setDaemon(true);
								return t;
							}
				} );
			}
			return pool;
		}
	}
	



//�̳߳صļ�����Ҫ����
//�̳߳� - ThreadPoolExecutor
//����
//corePoolSize �������߳�����
//maximumPoolSize ���߳�����߳���
//workQueue ���������У��洢�ȴ�ִ�е����� ����Ҫ ����̳߳����в����ش�Ӱ��
//keepAliveTime ���߳�û������ʱ��ౣ�ֶ��ʱ����ֹ
//unit ��keepAliveTime��ʱ�䵥λ
//threadFactory ���̹߳��������������߳�
//rejectHandler �����ܾ���������ʱ�Ĳ���
	
//����
//execute�������ύ���񣬽����̳߳�ִ��
//submit�������ύ�����ܹ�����ִ�н�� execute + Future
//shutdown�������ر��̳߳أ��ȴ�����ִ����
//shutdownNow�������ر��̳߳أ����ȴ�����ִ����
//getTaskCount�������̳߳���ִ�к�δִ�е���������
//getCompletedTaskCount����������ɵ���������
//getPoolSize�������̳߳ص�ǰ���߳�����
//getActiveCount��������ǰ�̳߳�������ִ��������߳�����
	
//�̳߳� - Executor��ܽӿ�
//Executors.newCachedThreadPool : �ɻ����̳߳أ�������Ҫ����ն����̣߳��̲߳���ᴴ�����߳�
//Executors.newFixedThreadPool �������̳߳أ������̵߳ȴ�
//Executors.newScheduledThreadPool �������̳߳أ�֧�ֶ�ʱ������������ִ��
//Executors.newSingleThreadExecutor �����߳��̳߳أ�����ָ������˳��ִ��
//�̳߳� - ��������
//
//cpu�ܼ������񣬾���Ҫ����ѹեCPU���ο�ֵ��ΪNCPU+1
//
//IO�ܼ������񣬲ο�ֵ��Ϊ2*NCPU
//�̳߳��ص�
//
//�̳߳ص�ʹ����Ҫ��ͬ�ô����̣߳����ٶ��󴴽���������Ч�߳���󲢷��������������Դ�������������������ܽϺ�

}

