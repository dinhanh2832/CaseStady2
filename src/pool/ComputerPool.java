package pool;

import model.Computer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class ComputerPool {
    private static final int NUMBER_OF_COMPUTER = 21;

    private final List<Computer> available = Collections.synchronizedList(new ArrayList<>());
    private final List<Computer> isUse = Collections.synchronizedList(new ArrayList<>());

    private final AtomicInteger count = new AtomicInteger(0);
    private final AtomicBoolean waiting = new AtomicBoolean(false);





}

