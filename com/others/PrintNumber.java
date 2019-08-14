package com.others;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintNumber {
	Lock lock = new ReentrantLock();
	
	Condition A = lock.newCondition();
	Condition B = lock.newCondition();
	Condition C = lock.newCondition();
	Condition D = lock.newCondition();
	
	int i = 1;
	
	public void print1(){
		
		lock.lock();
		try{
			if(i == 1){
				System.out.println("1");
				i++;
				//»½ÐÑ2
				B.signal();
			}else{
				try {
					A.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}finally{
			lock.unlock();
		}
		
	}
	
	
	public void print2(){
		lock.lock();
		try{
			if(i == 2){
				System.out.println("2");
				i++;
				C.signal();
			}else{
				try {
					B.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}finally{
			lock.unlock();
		}
	}
	
	
	public void print3(){
		lock.lock();
		try{
			if(i == 3){
				System.out.println("3");
				i++;
				D.signal();
			}else{
				try {
					C.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}finally{
			lock.unlock();
		}
	}
	
	
	public void print4(){
		lock.lock();
		try{
			if(i == 4){
				System.out.println("4");
				i = 1;
				A.signal();
			}else{
				try {
					D.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}finally{
			lock.unlock();
		}
	}
}
