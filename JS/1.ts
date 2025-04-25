// fat interface
interface Printer {
  print(): void;
  scan(): void;
  fax(): void;
  staple(): void;
  duplex(): void;
}

class BasicPrinter implements Printer {
  print() {
    console.log("Printing...");
  }

  scan() {
    throw new Error("Scan not supported");
  }

  fax() {
    throw new Error("Fax not supported");
  }

  staple() {
    throw new Error("Staple not supported");
  }

  duplex() {
    throw new Error("Duplex not supported");
  }
}
