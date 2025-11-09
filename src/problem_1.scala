/*
 * If we list all the natural numbers below $10$ that are multiples of $3$ or $5$, we get $3, 5, 6$ and $9$. The sum of these multiples is $23$.
 * Find the sum of all the multiples of $3$ or $5$ below $1000$.
 */
package euler_project.problem_1

def isMultipleOf(primes: Int*)(n: Int): Boolean =
  primes.find(n % _ == 0).isDefined

@main()
def main() = {
  val init   = 1
  val end    = 1000
  val primes = Seq(3, 5)
  val result = (init until end).filter(isMultipleOf(primes*)).sum
  println(result)
}
