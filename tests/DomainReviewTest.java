package io.portfolio;

public final class DomainReviewTest {
    public static void main(String[] args) {
        var item = new DomainReview.Item(42, 28, 27, 58);
        if (DomainReview.score(item) != 89) throw new AssertionError("domain score mismatch");
        if (!DomainReview.lane(item).equals("hold")) throw new AssertionError("domain lane mismatch");
    }
}
