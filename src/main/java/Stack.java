// SPDX-FileCopyrightText: 2024 Marlon Spiess
//
// SPDX-License-Identifier: MIT

/**
 * Die Klasse Stack implementiert eine einfache Datenstruktur für einen Stapel (Stack),
 * die die Grundoperationen eines Stapels unterstützt: Push, Pop, Top, Überprüfung auf Leere und die Größe des Stapels.
 * Ein Stack ist eine LIFO-Datenstruktur (Last In, First Out), bei der das zuletzt hinzugefügte Element
 * zuerst entfernt wird.
 */
public class Stack {
	
	private int maxSize = 0;
	int pos = -1;
	int[] stackArr = null;

	/**
	 * Konstruktor für die Klasse Stack.
	 * Initialisiert den Stack mit der angegebenen maximalen Größe.
	 *
	 * @param size die maximale Anzahl von Elementen, die im Stack gespeichert werden können
	 */
	public Stack(int size) {
		maxSize = size;
		stackArr = new int[size];
	}

	/**
	 * Überprüft, ob der Stack leer ist.
	 *
	 * @return true, wenn der Stack leer ist, andernfalls false
	 */
	public boolean isEmpty() {  
		if (this.size() == 0)  
			return true;  
		return false;  
	}

	/**
	 * Entfernt das oberste Element vom Stack und gibt es zurück.
	 * Gibt -1 zurück, wenn der Stack leer ist.
	 *
	 * @return das entfernte Element oder -1, wenn der Stack leer ist
	 */
	public int pop() {  
		if (pos == -1)  
			return -1;
		int element = stackArr[pos];  
		stackArr[pos] = -1;  
		pos--;  
		return element;  
	}

	/**
	 * Fügt ein Element zum Stack hinzu.
	 * Wirft eine StackOverflowError, wenn der Stack bereits voll ist,
	 * und eine IllegalArgumentException, wenn das Element negativ ist.
	 *
	 * @param element das hinzuzufügende Element
	 * @throws StackOverflowError wenn der Stack voll ist
	 * @throws IllegalArgumentException wenn das Element negativ ist
	 */
	public void push(int element) throws StackOverflowError,IllegalArgumentException {  		
		if (element<0)
			throw new IllegalArgumentException();
		int npos = pos + 1;  
		if (npos == maxSize)  
			throw new StackOverflowError("Stack is full");  
		pos = npos;  
		stackArr[pos] = element;  
	}

	/**
	 * Gibt die Anzahl der Elemente im Stack zurück.
	 *
	 * @return die Anzahl der Elemente im Stack
	 */
	public int size() { 		
		return pos + 1;  
	}

	/**
	 * Gibt das oberste Element des Stacks zurück, ohne es zu entfernen.
	 * Gibt -1 zurück, wenn der Stack leer ist.
	 *
	 * @return das oberste Element oder -1, wenn der Stack leer ist
	 */
	public int top() {
		if (this.isEmpty()) {
			return -1;
		} else {
			return stackArr[pos];
		}
	}
}  
