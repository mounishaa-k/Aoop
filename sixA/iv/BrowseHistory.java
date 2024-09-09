package SixaIv;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowseHistory {
    private Deque<String> backStack;
    private Deque<String> forwardStack;
    private String currentPage;

    public BrowseHistory() {
        backStack = new ArrayDeque<>();
        forwardStack = new ArrayDeque<>();
        currentPage = null;
    }

    public void visitPage(String url) {
        if (currentPage != null) {
            backStack.push(currentPage);
        }
        currentPage = url;
        forwardStack.clear(); 
        System.out.println("Visiting: " + currentPage);
    }

    public void goBack() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
            System.out.println("Going back to: " + currentPage);
        } else {
            System.out.println("No previous page in history.");
        }
    }

    public void goForward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
            System.out.println("Going forward to: " + currentPage);
        } else {
            System.out.println("No next page in history.");
        }
    }


    public void displayCurrentPage() {
        if (currentPage != null) {
            System.out.println("Current page: " + currentPage);
        } else {
            System.out.println("No page currently being viewed.");
        }
    }
}

