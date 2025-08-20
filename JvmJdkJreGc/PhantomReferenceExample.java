import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

class PhantomReferenceExample {

    public static void main(String[] args) throws InterruptedException {
        ReferenceQueue<MyResource> queue = new ReferenceQueue<>();
        MyResource resource = new MyResource("Database Connection 123");
        PhantomReference<MyResource> phantomRef = new PhantomReference<>(resource, queue);

        System.out.println("Resource object created: " + resource);
        System.out.println("Phantom reference get() initially: " + phantomRef.get()); // Always null

        resource = null; // Remove strong reference
        System.out.println("Strong reference removed.");

        // Request garbage collection
        System.gc();

        // Wait a bit for GC to do its job and enqueue the reference
        Thread.sleep(100);

        // Check the reference queue
        if (queue.poll() != null) {
            System.out.println("Phantom reference was enqueued! Performing final cleanup.");
            // This is where you would do your actual cleanup (e.g., closing files, native memory)
        } else {
            System.out.println("Phantom reference not yet enqueued.");
        }

        System.out.println("Phantom reference get() after GC: " + phantomRef.get()); // Still null
    }
}

class MyResource {
    private String name;

    public MyResource(String name) {
        this.name = name;
        System.out.println("MyResource '" + name + "' created.");
    }

    // Simulating some native resource that needs explicit closing
    public void close() {
        System.out.println("MyResource '" + name + "' explicitly closed.");
    }

    @Override
    protected void finalize() throws Throwable {
        // finalize() is generally discouraged, but shown here for contrast
        System.out.println("MyResource '" + name + "' finalize() called.");
        super.finalize();
    }
}